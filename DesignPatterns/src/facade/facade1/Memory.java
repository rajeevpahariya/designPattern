package facade.facade1;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Added item to memory.." + position);
    }
}
