public class smallStudnt extends Student {
    @Override
    public void play() {
        System.out.println(getName()+"再认真学习");
    }

    @Override
    public void study() {
        System.out.println("xiaoxues在打架");
        return;
    }

    @Override
    public boolean equals(Object obj) {
        smallStudnt smallStudnt=new smallStudnt();
        return this.getName().equals(smallStudnt.getName());
    }
}
