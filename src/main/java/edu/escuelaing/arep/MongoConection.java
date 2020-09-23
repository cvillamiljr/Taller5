package edu.escuelaing.arep;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;
import org.json.JSONObject;
import java.util.Date;


public class MongoConection {
    public static String ip = "ec2-54-161-227-107.compute-1.amazonaws.com";

    public static void main(String[] args) {
    }

    public static JSONObject select() {
        JSONObject rta = new JSONObject();
        MongoClient client = new MongoClient(ip, 27017);
        MongoIterable<String> iterable = client.listDatabaseNames();
        MongoDatabase DataBase = client.getDatabase("Arep");
        MongoCollection<Document> collection = DataBase.getCollection("MongoLab");
        FindIterable<Document> data = collection.find();

        int id = 1;
        for (Document i : data) {
            rta.put(String.valueOf(id), "Nombre: " + i.get("info") + ",dia: " + i.get("dia"));
            id++;
        }
        return rta;
    }

    public static JSONObject save(String palabra) {
        JSONObject rta = new JSONObject();
        try {
            MongoClient client = new MongoClient(ip, 27017);
            MongoDatabase DataBase = client.getDatabase("Arep");
            MongoCollection<Document> collection = DataBase.getCollection("MongoLab");
            Document document = new Document();
            document.append("info", palabra);
            Date date = new Date();
            document.append("dia", date.toString());
            collection.insertOne(document);
            rta.put("respo", "Guardado");
        } catch (Exception e) {
            rta.put("respo", "No se pudo guardar");
        }
        return rta;
    }

}
