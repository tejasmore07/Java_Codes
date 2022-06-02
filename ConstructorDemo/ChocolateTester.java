package ConstructorDemo;

class ChocolateTester {
    static int barcode,cost,weight;
    String name;

    public int getBarcode()
    {
        return barcode;
    }
    public void setBarcode(int barcode)
    {
        this.barcode=barcode;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public int getCost()
    {
        return cost;
    }
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int weight)
    {
        this.weight =weight;
    }
    ChocolateTester()
    {
        barcode= 101;
        name = "Cadbary";
        weight = 12;
        cost =10;
    }
    public void display()
    {
        System.out.println("Barcode:" +barcode);
        System.out.println("Name:" +name);
        System.out.println("Cost:" +cost);
        System.out.println("Weight:" +weight);
    }
    public static void main(String[] args)
    {
        ChocolateTester obj=new ChocolateTester();
        obj.display();


        obj.setBarcode(102);
        obj.setName("harshelys");
        obj.setCost(50);
        obj.setWeight(24);
        System.out.println("********");
        obj.display();

    }
}
