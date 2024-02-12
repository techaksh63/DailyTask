public class Mac {
    private String processor;
    private int quantity;
    private int month;

    public Mac(String processor, int quantity) {
        this.processor = processor;
        this.quantity = quantity;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
