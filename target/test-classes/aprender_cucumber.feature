Feature:Aprender Cucumber
	Como um aluno
	Eu quero aprendera utilizar Cucumber
	Para que eu possa automatizar criterios de aceitacao 

Scenario: Deve executar especificacao 
	Given que criei o arquivo corretamente
	When executar
	Then a especificacao deve finalizar com sucesso

Scenario: Deve incrementar contador 
	Given valor do contador 15
	When quando eu incrementar em 3
	Then o valor vai ser 18
	
Scenario: Deve incrementar contador 
	Given valor do contador 123
	When quando eu incrementar em 35
	Then o valor vai ser 158
	
Scenario: Deve calcular atraso na entrega
	Given que a entrega e dia 05/04/2018
	When a entrega pode atrasar em 2 dias
	Then a entrega var ser efetuada em 07/04/2018

Scenario: Deve calcular atraso na entrega da China
	Given que a entrega e dia 05/04/2018
	When a entrega pode atrasar em 2 meses
	Then a entrega var ser efetuada em 05/06/2018

Scenario: Deve criar steps genericos para estes passos
  Given que o ticket e AF345
  Given que o valor da passagem e 230,45
  Given que o nome do passageiro e "Fulano da Silva"
  Given que o telefone do passageiro e 9999-9999
  When criar os steps
  Then o teste vai funcionar

Scenario: Deve reaproveitar os steps "Dado" do cenário anterior
  Given que o ticket e AB167
  Given que o ticket especial e AB167
  Given que o valor da passagem e 1120,23
  Given que o nome do passageiro e "Cicrano de Oliveira"
  Given que o telefone do passageiro e 9888-8888

Scenario: Deve negar todos os steps "Dado" dos cenários anteriores
  Given que o ticket e CD123
  Given que o ticket e AG1234
  Given que o valor da passagem e 1.1345,56
  Given que o nome do passageiro e "Beltrano Souza Matos de Alcântara Azevedo"
  Given que o telefone do passageiro e 1234-5678
  Given que o telefone do passageiro e 999-2223 
