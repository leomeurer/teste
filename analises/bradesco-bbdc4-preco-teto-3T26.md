# Bradesco (BBDC4): análise fundamentalista e preço teto (data-base 3T26)

> Data da análise: 10/11/2026. Cotação de referência: **R$ 14,41** (fechamento de 09/11/2026).
> **Fonte principal:** planilha oficial de séries históricas do RI do Bradesco (`bradesco_3t26_series_historicas.xlsx`), com dados de 1T25 a 3T26. Imprensa e relatórios de corretoras entram só como complemento (NPL por segmento e NPL 15–90, que não estão na planilha).
> Isto não é recomendação de investimento.

---

## 1. DRE recorrente x DRE contábil: qual lucro usar no preço teto?

| R$ milhões | 1T25 | 2T25 | 3T25 | 4T25 | 1T26 | 2T26 | 3T26 |
|---|---|---|---|---|---|---|---|
| Margem com clientes | 16.771 | 17.756 | 18.611 | 19.119 | 19.498 | 20.199 | 20.497 |
| Margem com mercado | 462 | 288 | 99 | 126 | 553 | 673 | 875 |
| **PDD expandida** | −7.642 | −8.142 | −8.560 | −8.828 | −9.667 | −9.985 | **−10.642** |
| **Margem financeira líquida de PDD** | 9.591 | 9.902 | 10.150 | 10.417 | 10.384 | 10.887 | **10.730** ↓ |
| Seguros, previdência e capitalização | 5.303 | 5.650 | 5.706 | 5.649 | 6.384 | 6.119 | 5.590 ↓ |
| Receitas de serviços | 9.769 | 10.307 | 10.592 | 11.084 | 10.373 | 10.486 | 10.924 |
| Despesas operacionais | −15.006 | −15.898 | −16.488 | −16.958 | −16.178 | −16.436 | −16.316 |
| **Lucro líquido recorrente** | 5.864 | 6.067 | 6.205 | 6.516 | 6.811 | 7.050 | **7.109** |
| **Lucro líquido contábil** | 5.802 | 6.067 | 6.205 | 6.476 | **5.030** | 7.050 | 7.109 |
| Provisão fiscal, cível e trabalhista (contábil) | −1.313 | **−3.880** | −1.913 | −415 | −1.387 | −1.188 | −1.770 |

**Últimos 12 meses:**
- Lucro recorrente: **R$ 27,5 bi**.
- Lucro **contábil**: **R$ 25,7 bi**, ou −R$ 1,8 bi por causa da contingência fiscal do 1T26.

**Leituras da DRE:**
1. **Dividendo sai do lucro contábil.** O banco chama de "não recorrentes" as provisões fiscais, cíveis e trabalhistas, mas elas somaram **R$ 7,5 bi em 2025** e **R$ 4,3 bi em 9M26**. Elas aparecem todo ano. Por isso, no preço teto use o **lucro contábil** ou aplique um desconto de 5 a 7% sobre o recorrente.
2. **O lucro do 3T26 cresceu por causa da tesouraria, não do crédito.** A margem com mercado saiu de R$ 99 mi (3T25) para R$ 875 mi. Já a margem com clientes líquida de PDD (20.497 − 10.642 = R$ 9,86 bi) está **abaixo** do 3T25 (R$ 10,05 bi). O core de crédito, depois das perdas, encolheu 2% em um ano.
3. **O segurador perdeu força.** O resultado caiu de R$ 6,4 bi no 1T26 para R$ 5,6 bi. O índice combinado foi a 86,7% e a sinistralidade a 74,6%, os piores níveis da série recente. O segurador responde por **41% do lucro**.
4. **Imposto quase zero no contábil.** IR/CS contábil foi de −R$ 58 mi no 2T26 e −R$ 28 mi no 3T26, sobre lucro antes de impostos de ~R$ 7,2 bi cada. Em 2025, o IR/CS contábil foi até positivo (+R$ 2,2 bi). Isso vem do JCP e do uso/constituição de créditos tributários (seção 4). É legal, mas o lucro contábil depende disso.
5. **Ponto positivo:** a eficiência caiu de 50,7% para **47,2%** (12m). As despesas de pessoal e administrativas cresceram só ~3% a/a, abaixo da inflação de salários.

---

## 2. Preço teto (método Barsi)

```
Preço teto = DPA esperado / DY mínimo
DPA_PN     = LL × payout / (ON + 1,1 × PN) × 1,1        (a PN recebe 10% a mais que a ON)
Ações      = 5,607 bi ON + 5,590 bi PN = 11,197 bi      (pós-aumento de capital de R$ 10 bi)
```

### 2.1 Payout: o que a planilha mostra

- Dividendos/JCP por ação PN **líquido de IR**: R$ 0,31, 0,31, 0,31 e 0,32 nos últimos 4 trimestres, total de **R$ 1,25**. Isso equivale a cerca de **R$ 1,47 bruto** (o pagamento é quase todo em JCP).
- Distribuído em 9M26: R$ 12,1 bi. Isso é **58% do lucro recorrente** e **63% do contábil**. Em 2025 foi 59%.
- A esse preço, o DY realizado é de **~10,2% bruto e ~8,7% líquido**.
- O payout tem sido estável em **55 a 60%**. O risco é ele cair:
  - O RWA (ativos ponderados por risco) cresceu **14% a/a**, mais rápido que o lucro.
  - O Basileia (16,0%) só subiu por causa do aumento de capital de R$ 10 bi.
  - Se a PDD subir, o banco tende a reter mais lucro.

### 2.2 Matriz de preço teto da BBDC4, base lucro contábil (próximos 12 meses)

| LL contábil \ Payout | 45% | 55% | 60% |
|---|---|---|---|
| R$ 24 bi (estresse de crédito) | R$ 16,84 | R$ 20,59 | R$ 22,46 |
| **R$ 26 bi (base)** | R$ 18,25 | **R$ 22,30** | R$ 24,33 |
| R$ 28 bi (otimista) | R$ 19,65 | R$ 24,02 | R$ 26,20 |

*DY mínimo de 6% (clássico Barsi)*

| LL contábil \ Payout | 45% | 55% | 60% |
|---|---|---|---|
| R$ 24 bi | R$ 12,63 | R$ 15,44 | R$ 16,84 |
| **R$ 26 bi** | R$ 13,68 | **R$ 16,73** | R$ 18,25 |
| R$ 28 bi | R$ 14,74 | R$ 18,01 | R$ 19,65 |

*DY mínimo de 8%, mais coerente com a Selic de ~14%*

**Indicadores de preço:**
- P/L recorrente de **5,9x** (LPA de 12m de R$ 2,46).
- P/VP de **0,85x** (VPA de R$ 16,86).

**Conclusão do preço teto:**
- No critério clássico (6%), o teto fica entre **R$ 17 e R$ 22**, e a ação a R$ 14,41 tem margem de segurança.
- Exigindo 8%, o teto fica entre **R$ 13 e R$ 17**, e a cotação atual está dentro dessa faixa.
- **O teto só se sustenta se o lucro contábil não cair abaixo de ~R$ 24 bi.** A seção 3 mostra por que esse é o ponto a vigiar.

---

## 3. Risco de crédito: o que as tabelas oficiais mostram

### 3.1 Indicadores da carteira (aba 31)

| % | Mar25 | Jun25 | Set25 | Dez25 | Mar26 | Jun26 | Set26 |
|---|---|---|---|---|---|---|---|
| NPL > 90 dias | 4,1 | 4,1 | 4,1 | 4,1 | 4,2 | 4,3 | **4,6** |
| **Cobertura** (provisão / vencido > 90d) | 183,1 | 177,8 | 168,9 | 166,0 | 161,0 | 152,3 | **142,6** |
| Provisão / carteira expandida | 5,7 | 5,7 | 5,5 | 5,3 | 5,3 | 5,2 | **5,2** |
| Estágio 2 / carteira (Bacen) | 4,3 | 4,6 | 4,5 | 4,6 | 4,9 | 5,5 | **5,6** |
| Estágio 3 / carteira (Bacen) | 8,0 | 7,9 | 7,7 | 7,3 | 7,1 | 7,2 | **7,4** |

A cobertura caiu **40 p.p. em 18 meses**. O estoque de provisão ficou parado em ~R$ 58 a 60 bi enquanto a carteira cresceu 14% e o atraso subiu. Na prática, o banco está **consumindo colchão para sustentar o lucro**. Se a cobertura parar de cair e voltar a ser recomposta, a PDD sobe ainda mais.

### 3.2 Movimentação entre estágios, Res. 4.966 (aba 14). É a nota mais valiosa.

| R$ milhões | 3T25 | 4T25 | 1T26 | 2T26 | 3T26 | Var. a/a |
|---|---|---|---|---|---|---|
| Migração Estágio 1 → 2 | 10.558 | 10.440 | 13.323 | **16.858** | 14.646 | +39% |
| **Entrada no Estágio 3** (vindo de 1 e 2) | 8.911 | 8.797 | 10.134 | 11.154 | **13.947** | **+57%** |
| Baixas para prejuízo (write-off) | −9.199 | −8.427 | −10.009 | −9.218 | **−11.121** | +21% |
| Saldo Estágio 2 | 35.100 | 37.212 | 40.040 | 46.044 | **46.710** | **+33%** |
| Saldo Estágio 3 | 59.059 | 59.434 | 57.401 | 60.170 | **62.507** | +6% |
| Despesa bruta de perda esperada (aba 15) | 9.365 | 10.059 | 10.503 | 10.851 | **11.492** | +23% |

**Como ler esta tabela:**
- **Entrada no Estágio 3 (R$ 13,9 bi) > despesa de PDD bruta (R$ 11,5 bi).** O banco provisionou **83%** do que entrou em default no trimestre. É exatamente a "cobertura da formação" de 83% que o mercado comentou.
- **A esteira está cheia.** O Estágio 2 cresceu 33% em um ano contra 11% da carteira, e a migração 1→2 bateu recorde no 2T26. Esses créditos tendem a migrar para o Estágio 3 nos próximos 2 a 4 trimestres. Isso indica **PDD pressionada pelo menos até meados de 2027**.
- **O write-off cresceu 21%,** acompanhando a formação de inadimplência. Até aqui não há sinal de que o banco esteja "segurando" baixas.

### 3.3 Onde está o risco: carteira por produto e setor (abas 11 e 13)

| R$ milhões | Set25 | Set26 | Var. a/a | Comentário |
|---|---|---|---|---|
| **Crédito rural PJ** | 44.390 | **57.777** | **+30%** | 🔴 a linha que mais cresce, no meio de uma onda de recuperações judiciais no agro |
| Crédito rural PF | 39.067 | 41.529 | +6% | NPL de 3,1% contra 9,7% no sistema (imprensa) |
| **Rural total** | 83.457 | **99.306** | +19% | 8,6% da carteira |
| Capital de giro (inclui FGI/FGO) | 155.977 | 179.328 | +15% | 🔴 foi daqui que veio metade da alta do NPL |
| Cartão de crédito | 77.645 | 84.752 | +9% | |
| Crédito pessoal | 71.322 | 69.523 | −3% | 🟢 o banco está reduzindo |
| Consignado | 101.850 | 109.685 | +8% | 🟢 baixo risco |
| Imobiliário PF | 111.993 | 118.519 | +6% | 🟢 com garantia |
| Veículos PF | 40.176 | 50.934 | **+27%** | 🟡 com garantia, mas crescendo rápido |
| Setor de serviços (PJ) | 157.961 | 206.039 | **+30%** | 🟡 categoria ampla; vale abrir na nota |
| Varejo (PJ) | 50.015 | 48.783 | −2% | 🟢 reduzindo exposição em setor problemático |

Complemento da imprensa (não está na planilha):
- **NPL > 90 de PF: 5,8%**.
- **NPL > 90 de MPMEs: 4,9%** (era 3,7% um ano antes).
- **NPL de grandes empresas: 0,3%**.
- **NPL 15–90: 4,0% → 4,2%**.

### 3.4 Sensibilidade do lucro à inadimplência

A carteira tem R$ 1,15 tri. A alíquota efetiva do recorrente foi ~19% no 3T26, e a nominal é de 45%.

| Choque | PDD extra (antes de IR) | Impacto no LL | DPA PN perdido (payout de 55%) |
|---|---|---|---|
| +10 bps de custo do crédito | R$ 1,15 bi | −R$ 0,6 a 0,9 bi | −R$ 0,03 a 0,05 |
| +50 bps | R$ 5,75 bi | −R$ 3,2 a 4,7 bi | −R$ 0,17 a 0,24 |
| Recompor a cobertura para 160% (sem piora de NPL) | ~R$ 7,5 bi | −R$ 4 a 6 bi | −R$ 0,21 a 0,31 |

Esse último choque é um **risco "silencioso"**. Mesmo que o atraso pare de subir, voltar a cobertura para o nível de 1T26 custaria quase um ano inteiro de crescimento de lucro.

---

## 4. Créditos tributários: o "ativo" que mais pesa no patrimônio (aba 16)

| R$ milhões | Set25 | Dez25 | Mar26 | Jun26 | Set26 |
|---|---|---|---|---|---|
| Sobre provisão para perdas de crédito | 80.469 | 82.683 | 80.755 | 78.760 | 77.285 |
| Sobre prejuízo fiscal / base negativa | 19.107 | 18.945 | 21.476 | 16.357 | 17.967 |
| **Total de créditos tributários** | 118.681 | 119.839 | 120.348 | 113.932 | **113.186** |
| Patrimônio líquido | 169.590 | 172.239 | 173.549 | 175.230 | 188.475 |
| **Créditos tributários / PL** | 70% | 70% | 69% | 65% | **60%** |

- **60% do patrimônio líquido são créditos tributários.** Eles só "viram dinheiro" se o banco gerar lucro tributável no futuro. Por isso o P/VP de 0,85x é menos barato do que parece.
- O estoque está **caindo** (R$ 120 bi → R$ 113 bi). O banco está realizando créditos, e é isso que derruba o IR contábil para perto de zero. Quando o estoque ficar menor, a alíquota efetiva tende a subir e o lucro contábil a perder esse "subsídio".
- A maior parte (R$ 77 bi) vem de **provisões de crédito**. Há uma ironia aqui: provisionar mais gera crédito tributário, o que amortece parte do impacto no lucro, mas consome capital regulatório.
- Os R$ 18 bi de prejuízo fiscal (base negativa) são créditos de qualidade inferior, porque dependem de lucro tributável futuro na própria entidade.

## 5. Contingências e capital (abas 18 e 30)

- **Contingências provisionadas:** R$ 17,3 bi (fiscais R$ 6,0 bi, trabalhistas R$ 4,4 bi, cíveis R$ 7,0 bi). A provisão fiscal caiu de R$ 8,6 bi para R$ 6,0 bi em 18 meses (pagamentos/acordos).
  ⚠️ As contingências classificadas como **"possíveis"** não estão provisionadas. Elas só aparecem na nota explicativa do ITR, não nesta planilha. Vale conferir.
- **Basileia:** 16,0%; Nível I de 13,7%; CET1 de ~12,1%. A sobra sobre o mínimo exigido é de R$ 96,9 bi.
- **RWA:** +14% a/a (R$ 1,067 tri → R$ 1,217 tri). O banco está alocando capital em crédito mais arriscado (rural, capital de giro, serviços), o que é coerente com a alta do Estágio 2.

---

## 6. Síntese

**Pontos fortes:**
- P/L de 5,9x e P/VP de 0,85x.
- DY realizado de ~10% bruto.
- Eficiência na mínima histórica (47,2%).
- Despesas controladas.
- Grandes empresas saudáveis.
- Redução de exposição em crédito pessoal e varejo.

**Pontos fracos (o que as notas mostram e a manchete não):**
1. O lucro cresce pela **tesouraria e pelos impostos**, não pelo crédito: a margem com clientes líquida de PDD caiu 2% a/a.
2. A **entrada no Estágio 3 subiu 57% a/a**, e o Estágio 2 subiu 33% a/a. É a esteira de PDD futura.
3. A **cobertura caiu de 183% para 143%**: o colchão está sendo consumido.
4. O **crédito rural PJ cresceu 30%** no ciclo de recuperações judiciais do agro.
5. **60% do PL são créditos tributários**, e o IR contábil próximo de zero não é permanente.
6. O seguro, que é o amortecedor (41% do lucro), teve o pior índice combinado da série recente.

**Preço teto (lucro contábil de R$ 24 a 26 bi, payout de 55%):**
- DY de 6%: **R$ 20,50 a 22,30**.
- DY de 8%: **R$ 15,40 a 16,70**.

**Postura sugerida pelos dados:** a ação está abaixo do teto mesmo no cenário de estresse com 6% de DY. Mas os indicadores antecedentes (Estágio 2, entrada no Estágio 3, cobertura) apontam para PDD alta em 2027. **O risco não é o dividendo zerar. É ele parar de crescer, ou o payout cair para 45%.** Nesse caso, com DY exigido de 8%, o teto fica em ~R$ 13 a 14.

### Gatilhos para os próximos ITRs

| Indicador | Hoje | Sinal de melhora | Sinal de alerta |
|---|---|---|---|
| Entrada no Estágio 3 (trimestre) | R$ 13,9 bi | < R$ 11 bi | > R$ 15 bi |
| Saldo do Estágio 2 | R$ 46,7 bi | estabilizar | > R$ 50 bi |
| Cobertura | 142,6% | ≥ 145% | < 135% |
| Margem com clientes − PDD | R$ 9,86 bi | > R$ 10,5 bi | < R$ 9,5 bi |
| Crédito rural PJ | R$ 57,8 bi | desacelerar | NPL rural PJ subindo |
| DPA PN líquido trimestral | R$ 0,32 | ≥ R$ 0,32 | queda |
| Créditos tributários / PL | 60% | queda gradual | alta (prejuízo fiscal subindo) |

### Ainda falta verificar no ITR (não está na planilha)

- [ ] Contingências **possíveis** (não provisionadas), principalmente as fiscais
- [ ] Abertura do Estágio 3 e da perda esperada **por segmento** (rural PJ, MPMEs com FGI/FGO)
- [ ] Saldo garantido por FGI/FGO/Pronampe e prazo de honra das garantias
- [ ] Cronograma de realização dos créditos tributários (por ano)
- [ ] Concentração: aba "Maiores Devedores" (descontinuada; ver a nota do ITR)
- [ ] Evento subsequente: homologação do aumento de capital pelo BACEN

### Fontes

- Bradesco RI, séries históricas 3T26 (planilha enviada pelo usuário): abas 4, 7, 11, 13, 14, 15, 16, 18, 22, 27, 29, 30 e 31
- InfoMoney: https://www.infomoney.com.br/mercados/bradesco-bbdc4-resultados-terceiro-trimestre-2026/
- Investfy (NPL por segmento, NPL 15–90): https://investfy.com/bbdc4-no-3t26-lucro-bom-qualidade-razoavel/
- BB-BI / InvesTalk (CET1): https://investalk.bb.com.br/noticias/mercado/BBDC3T26
- Money Times (aumento de capital, nº de ações): https://www.moneytimes.com.br/bradesco-bbdc4-conclui-leilao-de-sobras-e-homologa-aumento-de-capital-de-r-10-bilhoes-lmrs/
- InfoMoney (rebaixamentos, cotação): https://www.infomoney.com.br/mercados/bradesco-bbdc4-sofre-segundo-rebaixamento-e-jpmorgan-corta-preco-alvo-em-quase-30/
- BTG (cotação de 09/11): https://content.btgpactual.com/research/ativo/BBDC4
