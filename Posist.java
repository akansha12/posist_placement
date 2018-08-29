import com.mongodb.client.MongoDatabase; 	// Libraries used for mongodb connection
import com.mongodb.client.MongoCollection;	// Libraries used for mongodb connection
import org.bson.Document;  			// for Document insertion in mongodb
import com.mongodb.MongoClient; 		//Libraries used for mongodb connection
import com.mongodb.MongoCredential;  		//Libraries used for mongodb connection
import java.util.Date;				// for timestamp calculation
import java.sql.Timestamp;			// for timestamp calculation
import java.util.HashSet;			// for creating hashsets
import java.util.Set;				// for creating hashsets

public class Posist { 
   
   public static void main( String args[] ) {  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
   
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("User", "posist", 
         "xyz".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      //Creating a collection 
      database.createCollection("posistCollection");
      
     //Creating Variables
      private float nodeValue;
      private int ownerID;
      private String ownerName;
      private int nodeNumber;
      private String nodeID;
      private String referenceNodeID;
      private String childReferenceNodeID;
      private String genesisNodeID;
      Date date= new Date();
      long time = date. getTime();
      Timestamp ts = new Timestamp(time);
      
      //Creating hashset of data
      Set<String> data = new HashSet<>();
      data.add(ownerID);
      data.add(ownerName);
      data.add(nodeValue);
      
      //Insert the genesis node 
      Document gdocument = new Document("title", "genesis") 
      .append("TimeStamp", ts)
      .append("data", data) 
      .append("Node_Number", nodeNumber)
      .append("Node_ID", ObjectId()) 
      .append("Child_Reference_Node_ID", childReferenceNodeID)
      .append("Genesis_Node_ID", ObjectId());  
      collection.insertOne(gdocument); 

      
      //Insert the records
       Document document = new Document("title", "nodes") 
      .append("TimeStamp", ts)
      .append("data", data) 
      .append("Node_Number", nodeNumber)
      .append("Node_ID", ObjectId()) 
      .append("Reference_Node_ID", referenceNodeID)
      .append("Child_Reference_Node_ID", childReferenceNodeID)
      .append("Genesis_Node_ID", genesisNodeID);  
      collection.insertOne(document); 
   } 
}
