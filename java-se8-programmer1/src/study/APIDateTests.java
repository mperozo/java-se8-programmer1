package study.api;

public class APIDateTests {

	final public static void main(String[] args) {

		/**
		 * LocalDate não tem construtor público. Os principais métodos estáticos
		 * para criar LocalDate: now, from, of e parse.
		 */
		// LocalDate date = LocalDate.now();
		// LocalDate date2 = LocalDate.of(2017, Month.DECEMBER, 30);
		// LocalDate date3 = LocalDate.parse("2010-11-21");

		/**
		 * É possível pedir qual o dia, o mês e o ano. Para o dia, é possível
		 * pedir o dia na semana, no mês e no ano. DayOfWeek retorna um enum, os
		 * outros métodos retornam números inteiros.
		 */ 
		// LocalDate date = LocalDate.now();
		// System.out.println(date);// 2017-11-30
		// System.out.println("Year: " + date.getYear());
		// System.out.println("MonthValue: " + date.getMonthValue());// 11
		// System.out.println("DayOfYear: " + date.getDayOfYear());// 334
		// System.out.println("DayOfMonth: " + date.getDayOfMonth());// 30
		// System.out.println("DayOfWeek: " + date.getDayOfWeek());// THURSDAY

		/**
		 * A classe período representa uma quantidade de tempo com dias, meses e
		 * anos.
		 */
		// Period dezDias = Period.ofDays(10);
		// System.out.println(dezDias);// P10D
		//
		// Period seisSemanas = Period.ofWeeks(6);
		// System.out.println(seisSemanas);// P42D
		//
		// Period seteMeses = Period.ofMonths(7);
		// System.out.println(seteMeses);// P7M
		//
		// Period vinteETresAnos = Period.ofYears(23);
		// System.out.println(vinteETresAnos);//P23Y
		//
		// Period doisAnosQuatroMesesE5Dias = Period.of(2, 4, 5);
		// System.out.println(doisAnosQuatroMesesE5Dias);// P2Y4M5D

		/**
		 * É possível gerar novos períodos adicionando ou removendo outros
		 * períodos (plus e minus)
		 */
		// Period period = Period.of(2, 8, 11);
		// System.out.println(period);// P2Y8M11D
		//
		// period = period.minus(Period.ofYears(1));
		// System.out.println(period);// P1Y8M11D

		/**
		 * É possível multiplicar todos os termos de um periodo. (multipliedBy)
		 */
		// Period period = Period.of(1, 8, 11);
		// System.out.println(period);// P1Y8M11D
		// System.out.println(period.multipliedBy(2));// P2Y16M22D

		/**
		 * É possível gerar novas datas adicionando ou removendo períodos
		 */
		// LocalDate date = LocalDate.now();
		// System.out.println(date);// 2017-12-01
		// Period dezDias = Period.ofDays(10);
		// date = date.minus(dezDias);
		// System.out.println(date);// 2017-11-21

		/**
		 * É possível descobrir o periodo entre duas datas com a classe Period
		 */
		// LocalDate date = LocalDate.now();
		// LocalDate date2 =
		// LocalDate.now().plus(Period.ofMonths(2).plusDays(3));
		//
		// Period period = Period.between(date, date2);
		// System.out.println(period);// P2M3D

		/**
		 * É possível buscar datas a partir de uma data. A classe
		 * TemporalAdjuster é responsável por esse ajuste na data.
		 */
		// LocalDate date = LocalDate.now();
		// System.out.println("Hoje: " + date.getDayOfWeek());
		//
		// TemporalAdjuster firstDayOfNextMonth =
		// TemporalAdjusters.firstDayOfNextMonth();
		// System.out.println("Primeiro dia do próximo mês será: " +
		// date.with(firstDayOfNextMonth).getDayOfWeek());

		/**
		 * Buscando a próxima quarta. Se a data já for uma quarta, ele pega a
		 * quarta da semana seguinte.
		 */
		// LocalDate date = LocalDate.now();
		// LocalDate proximaQuarta =
		// date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		// System.out.println("A próxima quarta feira será: " + proximaQuarta);

		/**
		 * Buscando a próxima sexta. Se a data já for uma sexta, ele pega esta
		 * data.
		 */
		// LocalDate date = LocalDate.now();
		// LocalDate proximaSexta =
		// date.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		// System.out.println("A próxima sexta feira será: " + proximaSexta);

		/**
		 * Buscando a última terça-feira
		 */
		// LocalDate date = LocalDate.now();
		// System.out.println(date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));

		/**
		 * É possível parsear datas de acordo com um pattern usando a classe
		 * DateTimeFormatter
		 */
		// DateTimeFormatter formatter =
		// DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// System.out.println(LocalDate.now().format(formatter));// 01/12/2017

	}

}
