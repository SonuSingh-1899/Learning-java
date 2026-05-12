package outputbase;

class output4 {
    public static void main(String[] args) {

        try {
            System.out.print("A");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("B");
            return;
        } finally {
            System.out.print("C");
        }
    }
}
