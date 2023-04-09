public class Main {
    public static void main(String[] args) {
        Chain chain1 = new PhoneHandler();
        Chain chain2 = new EmailHandler();
        Chain chain3 = new LiveChatHandler();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        Message msg = new Message("live chat");
        chain1.messagePassing(msg);
    }
}