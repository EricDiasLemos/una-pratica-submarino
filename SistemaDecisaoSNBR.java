import java.util.Scanner;

/**
 * Sistema de Decisão Estratégica - Projeto SN-BR
 * DGDNTM - Diretoria-Geral de Desenvolvimento Nuclear e Tecnológico da Marinha
 *
 * Simula três situações de decisão lógica para a gestão do submarino
 * de propulsão nuclear brasileiro.
 */
public class SistemaDecisaoSNBR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirCabecalho();

        // ============================================================
        // SITUAÇÃO 1: Orçamento e Cronograma
        // ============================================================
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║        SITUAÇÃO 1 — ORÇAMENTO E CRONOGRAMA               ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.print("Informe o valor do repasse anual (em bilhões de R$): ");

        double repasse = scanner.nextDouble();

        if (repasse < 0.5) {
            System.out.println("\n⚠️  ALERTA: Risco de paralisação total. Data estimada: 2045.");
        } else if (repasse >= 0.5 && repasse <= 1.0) {
            System.out.println("\n🔶 Ritmo lento: Finalização prevista para 2037.");
        } else {
            System.out.println("\n✅ Projeto acelerado: Possibilidade de antecipação da entrega.");
        }

        System.out.println();

        // ============================================================
        // SITUAÇÃO 2: Protocolo de Acesso Internacional
        // ============================================================
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║     SITUAÇÃO 2 — PROTOCOLO DE ACESSO INTERNACIONAL      ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        scanner.nextLine(); // Limpa o buffer

        System.out.print("Informe o nível de acesso (ex: TOTAL, PARCIAL, RESTRITO): ");
        String nivelAcesso = scanner.nextLine().trim().toUpperCase();

        System.out.print("Informe o código do país (ex: Brasil, EUA, China): ");
        String codPais = scanner.nextLine().trim();

        if (nivelAcesso.equals("TOTAL") && !codPais.equalsIgnoreCase("Brasil")) {
            System.out.println("\n🔴 ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados.");
        } else if (nivelAcesso.equals("TOTAL") && codPais.equalsIgnoreCase("Brasil")) {
            System.out.println("\n🟢 Acesso autorizado ao Almirantado.");
        } else {
            System.out.println("\n🟡 Nível de acesso [" + nivelAcesso + "] processado para país: " + codPais + ".");
            System.out.println("   Consulte os protocolos vigentes para este nível de permissão.");
        }

        System.out.println();

        // ============================================================
        // SITUAÇÃO 3: Propulsão — Simulação de Segurança do Reator
        // ============================================================
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║    SITUAÇÃO 3 — PROPULSÃO: SIMULAÇÃO DE SEGURANÇA       ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.print("Informe a temperatura atual do reator nuclear (°C): ");

        double temperatura = scanner.nextDouble();

        if (temperatura < 280.0) {
            System.out.println("\n🔵 Aumentar potência do reator.");
            System.out.printf("   Temperatura registrada: %.1f°C (abaixo do limiar operacional de 280°C).\n", temperatura);
        } else if (temperatura >= 280.0 && temperatura <= 350.0) {
            System.out.println("\n🟢 Operação Normal - Cruzeiro.");
            System.out.printf("   Temperatura registrada: %.1f°C (dentro da faixa segura: 280°C – 350°C).\n", temperatura);
        } else {
            System.out.println("\n🚨 EMERGÊNCIA: Acionar sistema de resfriamento e emergência!");
            System.out.printf("   Temperatura registrada: %.1f°C (acima do limite crítico de 350°C).\n", temperatura);
        }

        System.out.println();
        System.out.println("══════════════════════════════════════════════════════════════");
        System.out.println("  Relatório encerrado. Decisões registradas com êxito.");
        System.out.println("  DGDNTM — Marinha do Brasil  |  Projeto SN-BR  |  2026");
        System.out.println("══════════════════════════════════════════════════════════════");

        scanner.close();
    }

    /**
     * Exibe o cabeçalho do sistema no console.
     */
    private static void exibirCabecalho() {
        System.out.println();
        System.out.println("══════════════════════════════════════════════════════════════");
        System.out.println("        MARINHA DO BRASIL — SISTEMA DE DECISÃO SN-BR         ");
        System.out.println("   Submarino Convencionalmente Armado com Propulsão Nuclear   ");
        System.out.println("    DGDNTM — Diretoria-Geral Desenvolvimento Nuclear/TM       ");
        System.out.println("      Almirante de Esquadra Alexandre Rabello de Faria        ");
        System.out.println("══════════════════════════════════════════════════════════════");
        System.out.println();
    }
}