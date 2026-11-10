# Bradesco (BBDC4): análise fundamentalista e preço teto (data-base 3T26)

> Data da análise: 10/11/2026. Cotação de referência: **R$ 14,41** (fechamento de 09/11/2026).
> Os números vêm de releases e de relatórios de imprensa e de corretoras sobre o 3T26. Não foram conferidos linha a linha contra o ITR oficial.
> Antes de decidir, confira os números marcados com ⚠️ nas notas explicativas do ITR 3T26 (RI Bradesco ou CVM/RAD).
> Isto não é recomendação de investimento.

---

## 1. Fotografia do banco

| Indicador | 3T25 | 2T26 | 3T26 | Comentário |
|---|---|---|---|---|
| Lucro líquido recorrente | ~R$ 6,20 bi | ~R$ 7,05 bi | **R$ 7,11 bi** | 11º trimestre seguido de alta, mas só +0,8% t/t (o menor avanço da sequência) |
| ROAE | 14,7% | 16,2% | **15,6%** | 16,1% sem o efeito do aumento de capital |
| Margem com clientes (bruta) | — | R$ 20,2 bi | R$ 20,5 bi | spread de 9,1% para 8,9% |
| Margem com clientes **líquida de PDD** | — | — | R$ 9,9 bi | **−3,5% t/t e −2,0% a/a**. É aqui que o risco de crédito aparece |
| PDD expandida | ~R$ 8,5 bi | ~R$ 10,0 bi | **R$ 10,6 bi** | +24,3% a/a e +6,6% t/t, enquanto a carteira cresceu só 1,1% t/t |
| Custo do crédito | — | 3,5% | **3,7%** | |
| Carteira expandida | ~R$ 1,04 tri | — | R$ 1,15 tri | +11,1% a/a; 61,2% com garantia |
| Eficiência (12m) | 50,7% | 48,4% | 47,2% | despesas −1,0% a/a. Ponto positivo |
| Seguros (lucro) | — | — | R$ 2,9 bi | ROAE de 22%. Responde por ~40% do lucro do grupo |
| Capital Principal (CET1) | — | 11,3% | **12,1%** | subiu por causa do aumento de capital de R$ 10 bi |

Lucro dos últimos 12 meses (4T25 a 3T26): 6,5 + 6,81 + 7,05 + 7,11 ≈ **R$ 27,5 bi**.
Estimativa para 2026 (4T26 ≈ R$ 7,1 bi): **~R$ 28 bi**, um pouco acima do ponto médio do guidance (~R$ 27,5 bi).

**Número de ações (pós-aumento de capital):** 5,607 bi ON + 5,590 bi PN = **11,197 bi**.
⚠️ Em outubro faltava a homologação do BACEN. Usei o número pós-aumento por conservadorismo (mais ações, menos dividendo por ação).

**Valuation de mercado:** cerca de R$ 161 bi, ou **P/L de ~5,9x** sobre o lucro dos últimos 12 meses.

---

## 2. Preço teto (método Barsi/Bazin)

```
Preço teto = DPA esperado / DY mínimo exigido
DPA        = Lucro líquido × Payout / nº de ações
```

**Detalhe da BBDC4:** a PN recebe por lei **10% a mais** de provento que a ON. Por isso o DPA da PN é:

```
DPA_PN = LL × payout / (ON + 1,1 × PN) × 1,1 = LL × payout / 11,756 × 1,1
```

### 2.1 Cenários de lucro para os próximos 12 meses

| Cenário | Lucro líquido | Premissa |
|---|---|---|
| Estresse | R$ 25 bi | custo do crédito sobe ~80 bps (algo como 2023) e a margem trava |
| Pessimista | R$ 27 bi | PDD continua subindo mais que a carteira; lucro cai um pouco frente a 2026 |
| Base | R$ 29 bi | +3 a 4% sobre 2026; PDD sob controle, eficiência compensa |
| Otimista | R$ 31 bi | inadimplência estabiliza no 1S27 e a margem volta a crescer |

### 2.2 Matriz de preço teto da BBDC4 (DY mínimo de 6%, o critério clássico do Barsi)

| Lucro \ Payout | 40% | 50% | 60% |
|---|---|---|---|
| R$ 25 bi (estresse) | R$ 15,59 | R$ 19,49 | R$ 23,39 |
| R$ 27 bi (pessimista) | R$ 16,84 | R$ 21,05 | R$ 25,26 |
| **R$ 29 bi (base)** | R$ 18,09 | **R$ 22,61** | R$ 27,14 |
| R$ 31 bi (otimista) | R$ 19,34 | R$ 24,17 | R$ 29,01 |

### 2.3 A mesma matriz com DY mínimo de 8%

Com a Selic perto de 14%, 6% é pouco. Esta tabela exige 8%.

| Lucro \ Payout | 40% | 50% | 60% |
|---|---|---|---|
| R$ 25 bi | R$ 11,70 | R$ 14,62 | R$ 17,54 |
| R$ 27 bi | R$ 12,63 | R$ 15,79 | R$ 18,95 |
| **R$ 29 bi** | R$ 13,57 | **R$ 16,96** | R$ 20,35 |
| R$ 31 bi | R$ 14,50 | R$ 18,13 | R$ 21,75 |

### 2.4 Qual payout usar? É a premissa mais sensível

- Payout em 2025: R$ 14,5 bi / R$ 24,65 bi ≈ **59%**.
- Payout em 9M26: R$ 12,1 bi / R$ 20,97 bi ≈ **58%**. O 1S26 sozinho chegou a 69% bruto.
- **Mas atenção:** junto com o aumento de capital de R$ 10 bi, o banco **antecipou R$ 6,5 bi em JCP**. Na prática, os controladores receberam JCP e reinjetaram capital. Parte do payout de 2026 foi "financiada" pelo próprio aumento de capital.
- O aumento de capital foi pedido pelos controladores para reforçar o balanço, e o CET1 estava em 11,3% antes dele. Isso indica que **o payout orgânico sustentável fica mais perto de 40 a 50%** do que de 60%.
- Também lembre que o JCP tem 15% de IR na fonte. O DPA líquido para pessoa física é um pouco menor que o bruto usado acima.

**Leitura do preço teto (premissas conservadoras: lucro de R$ 27 bi, payout de 45%, DY de 6%):** cerca de **R$ 19**.
Exigindo 8% de DY, cai para cerca de **R$ 14,20**.
A R$ 14,41, a ação está **abaixo do teto no critério clássico de 6%** e praticamente **no teto quando se exige 8%**.
O que separa um caso do outro é quanto de DY você exige e o quanto a inadimplência vai corroer o lucro, assunto da seção 3.

---

## 3. Além do preço teto: o risco de crédito que pode atingir o lucro líquido

### 3.1 O que os números de inadimplência mostram

| Indicador | 3T25 | 2T26 | 3T26 | Sinal |
|---|---|---|---|---|
| NPL > 90 dias (total) | 4,1% | 4,3% | **4,6%** | 🔴 subindo |
| NPL > 90 dias, PF | — | 5,5% | **5,8%** | 🔴 |
| NPL > 90 dias, MPMEs | 3,7% | 4,4% | **4,9%** | 🔴 maior deterioração |
| NPL > 90 dias, grandes empresas | — | — | 0,3% | 🟢 |
| NPL 15–90 dias (inadimplência de curto prazo) | — | 4,0% | **4,2%** | 🔴 indicador **antecedente**: o que está aqui hoje vira NPL 90 amanhã |
| Estágio 2 (Res. 4.966) | 4,5% | — | **5,6%** | 🔴 indicador antecedente importante |
| Estágio 3, carteira expandida | ~7,5% | ~7,5% | ~7,5% | 🟡 estável |
| Índice de cobertura (PDD / NPL 90) | 168,9% | — | **142,6%** | 🔴 o colchão está encolhendo |
| Carteira reestruturada | — | — | 3,0% | 🟢 caindo |
| Cobertura da formação de estágio 3 | — | — | 83% | 🟡 seria >100% sem FGI/FGO |

### 3.2 Como ler isso nas notas explicativas

1. **NPL 15–90 e Estágio 2 subindo ao mesmo tempo** é o padrão clássico de que a PDD dos próximos 2 a 3 trimestres vai continuar alta. O mercado (Itaú BBA, JPMorgan e BTG rebaixaram para neutro) está precificando exatamente isso para 2027.
2. **Cobertura caindo de 169% para 143%.** O banco está provisionando menos por real de atraso. Parte disso se explica pelas linhas com garantia do Governo (FGI/FGO): ali o risco final é do fundo garantidor, então faz sentido provisionar menos. Mas o colchão para absorver surpresas ficou menor. ⚠️ Na nota de *Operações de crédito / Perda esperada*, confira quanto da carteira de MPMEs tem garantia FGI, FGO ou Pronampe e qual o prazo de honra da garantia.
3. **Cerca de metade da alta da inadimplência veio das linhas FGI/FGO, e 0,09 p.p. veio do Banco John Deere.** Excluindo esses efeitos, o NPL 90 ficaria em ~4,4%. É uma explicação legítima, mas confirme no ITR. Inadimplência com garantia pública demora a ser recuperada.
4. **Agro.** O NPL rural PF de 3,1% (contra 9,7% no sistema) está bem abaixo do mercado, mas houve sazonalidade de vencimentos no 3T. ⚠️ Procure na nota de concentração de risco por setor a exposição a agronegócio e a casos de recuperação judicial.

### 3.3 Sensibilidade: quanto a inadimplência pode "comer" do lucro

Carteira de R$ 1,15 tri. Alíquota de IR+CSLL de bancos de 45% (efetiva de ~35% considerando o JCP).

| Aumento no custo do crédito | PDD extra (antes de IR) | Impacto no lucro líquido | % do lucro de R$ 28 bi |
|---|---|---|---|
| +10 bps | R$ 1,15 bi | −R$ 0,63 a 0,75 bi | −2 a 3% |
| +50 bps | R$ 5,75 bi | −R$ 3,2 a 3,7 bi | −11 a 13% |
| +80 bps (algo como 2023) | R$ 9,2 bi | −R$ 5,1 a 6,0 bi | −18 a 21% |

Regra de bolso: **cada 0,1 p.p. de custo do crédito ≈ R$ 0,7 bi de lucro**, ou cerca de R$ 0,03 a 0,04 por ação PN em dividendos com payout de 50%.

### 3.4 Outros riscos para olhar nas notas

- **Contingências fiscais.** No 1T26 houve despesa não recorrente de **R$ 1,8 bi** de contingência fiscal, que ficou fora do lucro recorrente. Mas **dividendo sai do lucro contábil, não do recorrente**. ⚠️ Na nota de *Provisões, passivos contingentes e obrigações legais*, olhe os processos fiscais com risco "possível", que não estão provisionados.
- **Créditos tributários (ativo fiscal diferido).** O Bradesco tem um estoque grande. Se a lucratividade cair, a realização desses créditos atrasa e eles consomem capital regulatório. ⚠️ Na nota de *Créditos tributários*, veja o cronograma de realização e o valor presente.
- **Dependência de seguros.** Seguros respondem por ~40% do lucro e caíram −1,9% t/t. Isso diversifica o risco de crédito, mas sinistralidade e rentabilidade das reservas (ligada à Selic) importam.
- **Macro pós-eleição.** O mercado caiu forte em 26/10 com o resultado inesperado da eleição. Juros futuros mais altos e PIB de 2027 menor (~1,4%) tornam mais provável o cenário pessimista de lucro.
- **Capital.** O CET1 de 12,1% está confortável só depois do aumento de capital. Se a PDD subir, o banco pode preferir reter lucro, ou seja, **payout menor**.

---

## 4. Síntese

**A favor:**
- P/L de ~5,9x.
- DY corrente alto.
- Eficiência melhorando: despesas caindo em termos reais.
- Seguros fortes, com ROAE de 22%.
- Qualidade melhor em grandes empresas e consignado.
- Carteira reestruturada em queda.

**Contra:**
- PDD crescendo 2x mais que a carteira.
- Margem líquida de PDD caindo.
- NPL 15–90 e Estágio 2 subindo, sinalizando que a PDD seguirá pressionada.
- Cobertura menor.
- Payout recente "inflado" pela antecipação de JCP.
- Macro de 2027 pior.

**Preço teto (Barsi, DY de 6%):**
- Faixa realista de **R$ 17 a R$ 21**.
- Cenário pessimista ou de estresse com payout de 40 a 45%: ~R$ 16 a 17.

**Com DY de 8%:**
- Faixa de **R$ 13 a R$ 16**.
- A cotação atual (R$ 14,41) está dentro dela.

**Gatilhos para revisar a tese nos próximos ITRs:**
1. NPL 15–90 voltar abaixo de 4,0%.
2. Estágio 2 parar de subir.
3. Margem com clientes líquida de PDD voltar a crescer t/t.
4. Payout de 2027 anunciado sem antecipações.
5. Índice de cobertura estabilizar acima de 140%.

### Checklist das notas explicativas do ITR 3T26

- [ ] Operações de crédito: abertura por estágio (1/2/3), por segmento e por setor (agro, varejo, construção)
- [ ] Perda esperada: movimentação da provisão (constituição, baixa a prejuízo, recuperação)
- [ ] Carteira renegociada/reestruturada: saldo e provisão associada
- [ ] Garantias FGI/FGO/Pronampe: saldo coberto
- [ ] Créditos tributários: estoque e cronograma de realização
- [ ] Provisões e passivos contingentes: fiscais, cíveis e trabalhistas (provável x possível)
- [ ] Gerenciamento de capital: CET1, Basileia, buffers
- [ ] Partes relacionadas e evento subsequente (homologação do aumento de capital, JCP declarados)

### Fontes

- InfoMoney, resultado 3T26: https://www.infomoney.com.br/mercados/bradesco-bbdc4-resultados-terceiro-trimestre-2026/
- Bloomberg Línea: https://www.bloomberglinea.com.br/negocios/lucro-do-bradesco-perde-folego-no-3-tri-com-alta-da-inadimplencia-e-das-provisoes/
- Seu Dinheiro: https://www.seudinheiro.com/2026/empresas/lucro-do-bradesco-bbdc4-no-3t26-rentabilidade-roe-calotes-podem-frear-a-virada-miql/
- Investfy: https://investfy.com/bbdc4-no-3t26-lucro-bom-qualidade-razoavel/
- BB-BI / InvesTalk: https://investalk.bb.com.br/noticias/mercado/BBDC3T26
- Money Times, aumento de capital: https://www.moneytimes.com.br/bradesco-bbdc4-conclui-leilao-de-sobras-e-homologa-aumento-de-capital-de-r-10-bilhoes-lmrs/
- Money Times, 1T26: https://www.moneytimes.com.br/bradesco-bbdc4-lucro-sobe-mais-16-e-chega-a-r-68-bilhoes-no-1t26-acima-das-expectativas-rnda/
- Seu Dinheiro, 4T25 e guidance 2026: https://www.seudinheiro.com/2026/empresas/balanco-bradesco-bbdc4-4t25-2025-lucro-rentabilidade-roe-guidance-2026-miql/
- InfoMoney, rebaixamentos: https://www.infomoney.com.br/mercados/bradesco-bbdc4-sofre-segundo-rebaixamento-e-jpmorgan-corta-preco-alvo-em-quase-30/
- Seu Dinheiro, Itaú BBA: https://www.seudinheiro.com/2026/empresas/o-que-fez-o-itau-bba-abandonar-o-otimismo-com-o-bradesco-bbdc4/
- Cotação, BTG: https://content.btgpactual.com/research/ativo/BBDC4
- Dividendos: https://www.suno.com.br/noticias/bradesco-bbdc4-banestes-bees3-agenda-dividendos-30102026-go/
