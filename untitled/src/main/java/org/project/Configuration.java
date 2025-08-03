package org.project;

//cria uma classe configuração, com um metodo construtor privado, onde so só a classe propria pode construir o objeto.
public class Configuration {

    private static Configuration instance;

    private Configuration() {

    }

    //1 exemplo: metodo para criar a instancia, caso nao teja. se tiver, retorna a instancia
//    public static Configuration getInstance() {
//        if (instance == null) {
//            instance = new Configuration();
//        }
//        return instance;
//    }

    //2 exemplo: THREAD SAFE - cincronização em mutiplas threads
//    public static synchronized Configuration getInstance() {
//        if (instance == null) {
//            instance = new Configuration();
//        }
//        return instance;
//    }
    //3 exemplo: DOUBLE CHECKED LOKING para tratar com mutiplas threads e sincronizando e conferindo as.
    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }
}
