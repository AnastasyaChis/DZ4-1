public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(10_000); // должно получиться 500
        System.out.println(miles);

        System.out.println();
        System.out.println(service.calculate(1689));//должно получиться 84

        System.out.println();
        System.out.println(service.calculate(14980));//должно получиться 749

        System.out.println();
        System.out.println(service.calculate(1500));//должно получиться 75

    }
}
