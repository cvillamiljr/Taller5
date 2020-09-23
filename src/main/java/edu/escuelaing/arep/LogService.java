package edu.escuelaing.arep;

import org.json.JSONObject;
import spark.Request;

import static spark.Spark.get;
import static spark.Spark.port;

public class LogService {

    public static void main(String... args){

        port(getPort());
        get("/select", (req,res) -> select());
    }


    private static JSONObject select(){

        MongoConection conection= new MongoConection();
        JSONObject rta= conection.select();
        return rta;

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 34000;
    }
}
