public class FinalValueAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int xValue = 0;
        for (String operation : operations) {
            if (operation.contains("--")) {
                xValue--;
            }
            else if (operation.contains("++")) {
                xValue++;
            }
        }
        return xValue;
    }
}
