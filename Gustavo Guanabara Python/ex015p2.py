real = float(input('Quanto dinheiro voce tem na carteira?  R$'))
dolar = real / 5.08
euro = real / 5.33
print('Com R${} voce consegue comprar US${:.2f} e Є{:.2f}'.format(real, dolar, euro))