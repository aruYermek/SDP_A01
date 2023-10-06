public class DatabaseConnection {
        private static DatabaseConnection instance;
        private String url;
        private String username;
        private String password;
        private DatabaseConnection(String url, String username, String password) {
            this.url = url;
            this.username = username;
            this.password = password;
        }
        public synchronized static DatabaseConnection getInstance(String url, String username, String password) {
            if (instance == null) {
                synchronized (DatabaseConnection.class){
                    if(instance == null){
                        instance = new DatabaseConnection(url, username, password);
                    }
                }
            }
            return instance;
        }

        public void connect(){
            System.out.println("Connected to: " + url);
        }

    }

