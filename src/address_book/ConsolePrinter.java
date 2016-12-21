package address_book;


public interface ConsolePrinter {

    public void print(String feedback);

    System.out.println("add \t Lägger till en ny kontakt"+
        "\ndelete\t Tar bort en kontakt"+
        "\nlist\t Listar alla kontakter")
}
