package lld.design.singleton;

/*Version 1 */
// eager initialization
// public class ConnectionPool {

//     // Step 3: Add a static variable
//     private static ConnectionPool instance = new ConnectionPool();

//     // Step 1: Hide constructor
//     private ConnectionPool(){}

//     // Step 2: Static Initializer
//     public static ConnectionPool getInstance(){
//         return instance;
//     }

// }

/* Version 2 */
// On demand initialization
// public class ConnectionPool {

//     // Step 3: Add a static variable
//     private static ConnectionPool instance = null;

//     // Step 1: Hide constructor
//     private ConnectionPool(){}

//     // Step 2: Static Initializer
//     public static ConnectionPool getInstance(){
//         if (instance == null){
//             instance = new ConnectionPool(); 
//         }
//         return instance;
//     }

// }

/*
 Problems:
 If two threads try to operate at same time, then they will create two diff instances, so our solution is not thread safe
 So, need to use lock using sync keyword
 */

 /* Version 3 */
 public class ConnectionPool {

    // Step 3: Add a static variable
    private static ConnectionPool instance = null;

    // Step 1: Hide constructor
    private ConnectionPool(){}

    // Step 2: Static Initializer
    public static ConnectionPool getInstance(){
        if (instance == null){
            synchronized (ConnectionPool.class){
                if (instance == null){
                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }
}