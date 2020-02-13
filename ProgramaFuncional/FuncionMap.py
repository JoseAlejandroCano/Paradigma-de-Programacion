#Obtener el cuadrado de todos los elementos en la lista.

def cuadrado(elemento=0):
    return elemento * elemento

lista = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

#resultado = list( map(cuadrado, lista) )

resultado = list( map( lambda elemento : elemento * elemento , lista) )
print(resultado)
