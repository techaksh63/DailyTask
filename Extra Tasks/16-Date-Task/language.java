public class language {
    private int java;
    private int react;
    private int bi;

    public language(int java, int react, int bi) {
        this.java = java;
        this.react = react;
        this.bi = bi;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getReact() {
        return react;
    }

    public void setReact(int react) {
        this.react = react;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }

    @Override
    public String toString() {
        return "language{" +
                "java=" + java +
                ", react=" + react +
                ", bi=" + bi +
                '}';
    }
}
