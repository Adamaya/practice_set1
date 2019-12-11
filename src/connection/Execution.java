package connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

class Cars{
    private String model;
    private String company;
    private double price;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cars(String model, String company, double price, int id) {
        this.model = model;
        this.company = company;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return  id+" "+model + " "+company+" "+price;
    }
}

public class Execution {
    public static void main(String[] args) {
        JdbcConnection jdbcConnection=new JdbcConnection();
        Helper helper=new Helper();
        if(jdbcConnection.attemptConnection()){
            System.out.println("Connected");
            ResultSet alldata=helper.fetchData(jdbcConnection.getConnection());
            ArrayList<Cars> carsArrayList=new ArrayList<>();
            while(true){
                try{
                    if (!alldata.next()){
                        break;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try{
                    Cars cars=new Cars(alldata.getString("model"),alldata.getString("company"),
                            alldata.getDouble("price"),alldata.getInt("id"));
                    carsArrayList.add(cars);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(carsArrayList);
        }
    }
}
