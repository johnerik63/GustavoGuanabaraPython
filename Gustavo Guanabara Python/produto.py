produto = float(input('Qual o valor do produto? R$'))
parcelado = produto + (produto * 8 / 100)
avista = produto - (produto * 10 / 100)
print('O valor do produto é R${}, se pagar a vista fica por R${} e parcelado fica por R${}.'.format(produto, avista, parcelado))
