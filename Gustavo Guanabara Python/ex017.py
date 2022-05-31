produto = float(input('Qual é o preço do produto? R$'))
desconto = produto - (produto * 5 / 100)

print('O produto que custava R${}, na promoção com desconto de 5% vai custar R${}'.format(produto, desconto))