package Creational.Singleton;

public final class Singleton {
    private static volatile Singleton instance;


    private Singleton(){}

    public static Singleton getInstance(){
        // 1. Перша перевірка (швидкий вихід без блокування)
        if(instance == null){
            // 2. Блокуємося лише тоді, коли інстансу ще немає
            synchronized (Singleton.class){
                // 3. Друга перевірка (запобігаємо створенню об'єкта, якщо його створив інший потік)
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
