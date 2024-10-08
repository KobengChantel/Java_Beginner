package Book3.chapter3;

//THE SINGLETON PATTERN


//A singleton is a class that you can use to create only one instance. When you try to create
//an instance, the class first checks to see whether an instance already exists. If so, the
//existing instance is used; if not, a new instance is created


class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass()
    {
    }
    public static SingletonClass getInstance()
    {
        if (instance == null)
            instance = new SingletonClass();
        return instance;
    }
}
