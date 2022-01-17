package builder.klasyczny;

public class Main {
    public static void main(String[] args) {
        SmallHouseBuilder smallHouseB=new SmallHouseBuilder();
        BigHouseBuilder bigHouseB=new BigHouseBuilder();
        HouseDirector small=new HouseDirector(smallHouseB);
        small.buildHouse();
        HouseDirector big=new HouseDirector(bigHouseB);
        big.buildHouse();

        House smallHouse= small.getHouse();
        House bigHouse= big.getHouse();


        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
