package Coffee_Module;

public class Coffee_Maker {
    // disini kita definisikan resourcenya sebagai class variable
    // biar bisa diakses sama banyak fungsi/method.
    int coffee = 2000; // 2000 gram
    int water = 10000; // 10000 gram air atau 10 liter air
    int sugar = 10000; // 10000 gram gula atau 10 kg
    int creamer = 1000; // 1000 gram creamer

    float espresso_price = 5.0f;
    float americano_price = 4.0f;
    float latte_price = 6.0f;


    public Coffee_Maker(){}

    protected boolean checkespresso(){
        // boleh pakai this.coffee untuk mastiin ke komputer bahwa coffeenya itu
        // nge referensikan class variable kopi
        if(coffee < 50){
            System.out.println("Maaf kopi untuk pembuatan espresso sudah tidak" +
                    "mencukupi");
            return false;
        }
        if (water < 100){
            System.out.println("Maaf air untuk pembuatan espresso sudah tidak" +
                    "mencukupi");
            return false;
        }
        if (sugar < 10){
            System.out.println("Maaf sugar untuk pembuatan espresso sudah tidak" +
                    "mencukupi");
            return false;
        }
        if (creamer < 15){
            System.out.println("Maaf creamer untuk pembuatan espresso sudah tidak" +
                    "mencukupi");
            return false;
        }
        return true;
    }
    protected float makeespresso(){
        this.coffee = this.coffee - 50;
        this.water = this.water - 100;
        this.sugar = this.sugar - 10;
        this.creamer = this.creamer -15;
        return this.espresso_price;
    }

    // check ada resourcenya, kalau enggak ada: return false, kalau ada: true
    protected boolean checkamericano(){
        if(coffee < 80){
            System.out.println("Maaf kopi untuk pembuatan americano sudah tidak" +
                    "mencukupi");
            return false;
        }
        if (water < 100){
            System.out.println("Maaf air untuk pembuatan americano sudah tidak" +
                    "mencukupi");
            return false;
        }
        if (sugar < 10){
            System.out.println("Maaf sugar untuk pembuatan americano sudah tidak" +
                    "mencukupi");
            return false;
        }
        if (creamer < 5){
            System.out.println("Maaf creamer untuk pembuatan americano sudah tidak" +
                    "mencukupi");
            return false;
        }
        return true;
    }

    // kurangin resourcenya untuk bikin kopi dan balikin nominal yang harus
    // dibayar sama user
    protected float makeamericano(){
        this.coffee = this.coffee - 80;
        this.water = this.water - 100;
        this.sugar = this.sugar - 10;
        this.creamer = this.creamer -5;
        return this.americano_price;
    }



    protected boolean latte(){return true;}
    protected void makelatte(){

    }

    protected void availableCoffee(){

    }
}
