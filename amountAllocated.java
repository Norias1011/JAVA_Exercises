public class amountAllocated {
    public static void main(String[] args) {
        int laptopPrice = 55480 * 6;
        int monitorPrice = 21830 * 3;
        int micePrice = 411 * 11;
        int keyboardPrice = 290 * 5;
        int budget = laptopPrice + monitorPrice + micePrice + keyboardPrice;
        System.out.println("Need to allocate: " + (laptopPrice + monitorPrice + micePrice + keyboardPrice));
    }
}
