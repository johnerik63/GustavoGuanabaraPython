largura = float(input('Largura da parede: '))
altura = float(input('Altura da parede: '))
area = largura * altura
tinta = area / 2
print('Sua parede tem a dimensao de {}x{} e sua area é de {}. \nPara pintar essa parede, voce precisara de {}l de tinta.'.format(altura, largura, area, tinta))
