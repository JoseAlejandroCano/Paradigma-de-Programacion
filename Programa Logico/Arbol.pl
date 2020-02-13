/*Hechos Sencillos*/
hombre(dante).
hombre(carlos).
hombre(beto).
hombre(andres).

/*Hechos con 2 objetos*/

        /* X     A */
espadre(dante,carlos).
        /* A     Y */
espadre(carlos,beto).
       /* X     A */
       /* A     Y */
espadre(beto,andres).

/*Reglas básicos*/

/*Regla esabuelo*/

/*X es abuelo de Y si existe alguna regla donde x sea padre de un objeto A y a la vez ese objeto A es padre Y*/

esabuelo(X,Y):-
    espadre(X,A),
    espadre(A,Y).


