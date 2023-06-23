package Principles.DependecyInversion;


public class DependecyInversion {
}

class PasswordReminder{
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}

interface DBConnectionInterface{
    public int connect();
}

class MySQLConnection implements DBConnectionInterface{
    @Override
    public int connect() {
        return 0;
    }
}
