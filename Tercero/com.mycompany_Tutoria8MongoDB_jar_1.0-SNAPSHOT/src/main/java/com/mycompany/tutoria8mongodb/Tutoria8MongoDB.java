/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tutoria8mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


public class Tutoria8MongoDB {

    public static void main(String[] args) {
        MongoClient mongo=crearConexion();
        if (mongo!=null){
            DB db=mongo.getDB("NuevaBasedeDatos");
            System.out.println("base de datos creada");
            
            /*insertarUsuario(db,"datos","gissela","saldarriaga");
            insertarUsuario(db,"datos","maria","barra");
            insertarUsuario(db,"datos","ana","lola");
            insertarUsuario(db,"miembros","sandara","maria");*/
            /*mostrarColeccion(db,"datos");
            System.out.println("base de datos miembros");
            mostrarColeccion(db,"miembros");*/
            buscarPorNombre(db,"datos","gissela");
            buscarPorNombre(db,"miembros","sandra");
        }
        
    }
    
    public static MongoClient crearConexion(){
        System.out.println("Coneccion realizada");
        MongoClient mongo=null;
        mongo=new MongoClient ("localhost",27017);
        return mongo;
    }
    
   public static void insertarUsuario(DB db,String coleccion, String nombre,String apellido){
       DBCollection colec=db.getCollection(coleccion);
       BasicDBObject documento=new BasicDBObject();
       documento.put("nombre", nombre);
       documento.put("apellido", apellido);
       colec.insert(documento);
       
   } 
    
   public static void mostrarColeccion (DB db,String coleccion){
       DBCollection colect=db.getCollection(coleccion);
       DBCursor cursor=colect.find();
       while(cursor.hasNext()){
         System.out.println("-- "+cursor.next().get("nombre")+" - "+cursor.curr().get("apellido"));
           
       }
   }
   
   public static void buscarPorNombre(DB db,String coleccion, String nombre){
       DBCollection colect=db.getCollection(coleccion);
       BasicDBObject consulta=new BasicDBObject();
       consulta.put("nombre",nombre);
       DBCursor cursor=colect.find(consulta);
       while(cursor.hasNext()){
          System.out.println("*** "+cursor.next().get("nombre")+"  "+cursor.curr().get("apellido")); 
       }
       
   }
   
}
