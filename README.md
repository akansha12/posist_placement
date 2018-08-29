# posist code 

Prerequisite : Need to have MongoDB and Java virtual Machine installed in the system 


Why MongoDB ??

Since the project given to us requires us to input the records dynamically and assign to every record its parent node address and child node address. 
This operation can be easily performed with mongoDB.
MongoDB is a NOSQL database and requires no pre-defined schemas, it will become easy for us to manage Genesis and other nodes.
Since MongoDB stores the record in BSON/JSON format, it will be easy for us to operate with that data.

Why Java??

Since I am comfortable with Java and MongoDB supports java, thats why I have choosen java as my language.

In the Code ............

As far as I could get, I created a Structure for Genesis node and a General node.
I have thought of the project in folllowing manner :

1- I have assigned each node NODE-ID with ObjectId() function which will automatically create a unique String of 12bytes for every node it is called upon.
2- Now we can assign nodes to their parents to assign them children with the help of NODE-ID
3- REFERENCE-ID of each node will contain the NODE-ID of their parent.
4- CHILD-REFERENCE-ID of each node will contain the NODE-ID of their children


How to assign REFERENCE-ID ?

1- Initially nodes will be children of genesis node.
2- Node entered by user will submitted to database collection.
3- Then its value will be compared with genesis node value
            Label : if( new_node_value < genesis_node_value)
                    then check for other nodes who has GENESIS NODE-ID as their REFERENCE-ID 
                    and add their node values
                    now subtract the genesis node value from the resultant sum 
                    check if its small then genesis node value
                    if YES
                        Assign the genesis NODE-ID as a REFERENCE-ID of the new node
                    else
                        repeat from the Label, just replace genesis_node_value with the value of the next node available
                        
                        
  Hence in this way we will create a Tree like structure
  
  Editing Value of a node??
  
  can be easily done with update() function of mongoDB
  
  Finding the longest chain ??
  
  Since now we have a tree like structure we can find the height of any node from the leaf nodes ( Leaf nodes will have their CHILD-REFERNCE-ID as null )

