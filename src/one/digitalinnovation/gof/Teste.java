package one.digitalinnovation.gof;


import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robonormal = new Robo();
        robonormal.setComportamento(normal);
        robonormal.mover();
        robonormal.mover();

        Robo robodefensivo = new Robo();
        robodefensivo.setComportamento(defensivo);
        robodefensivo.mover();
        robodefensivo.mover();

        Robo roboagressivo = new Robo();
        roboagressivo.setComportamento(agressivo);
        roboagressivo.mover();
        roboagressivo.mover();

    }

    //facede

    Facade facade = new Facade();
    //facade.migrarCliente("Suhellyn", "12345678919");
}
