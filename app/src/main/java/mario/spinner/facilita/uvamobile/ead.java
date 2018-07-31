package mario.spinner.facilita.uvamobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.spinner.facilita.uvamobile.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ead extends AppCompatActivity {

    ExpandableListAdapter2 listAdapter2;
    ExpandableListView expListView2;
    List<String> listDataHeader2;
    HashMap<String, List<String>> listDataChild2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ead);

        // get the listview
        expListView2 = (ExpandableListView) findViewById(R.id.lvExp2);

        // preparing list data
        prepareListData();

        listAdapter2 = new ExpandableListAdapter2(this, listDataHeader2, listDataChild2);

        // setting list adapter
        expListView2.setAdapter(listAdapter2);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader2 = new ArrayList<String>();
        listDataChild2 = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader2.add("Janeiro");
        listDataHeader2.add("Fevereiro");
        listDataHeader2.add("Março");
        listDataHeader2.add("Abril");
        listDataHeader2.add("Maio");
        listDataHeader2.add("Junho");
        listDataHeader2.add("Julho");
        listDataHeader2.add("Agosto");
        listDataHeader2.add("Setembro");
        listDataHeader2.add("Outubro");
        listDataHeader2.add("Novembro");
        listDataHeader2.add("Dezembro");
        listDataHeader2.add("Janeiro");



        // Adding child data
        List<String> janeiro = new ArrayList<String>();
        janeiro.add("Dia 30 - Término do período para mudança de modalidade - EAD para presencial - via web");

        List<String> fevereiro = new ArrayList<String>();
        fevereiro.add("Dia 1 - Início do período para análise da A3 (presencial - 2016.2) pelos docentes\n" +
                "      - Término do período para solicitação de cancelamento de matrícula - calouros - via web");
        fevereiro.add("Dia 2 - Término do período para solicitação, via protocolo, de mudança de campus/curso/turno - (calouros e veteranos) - via web");
        fevereiro.add("Dia 3 - Início do período de resposta ao protocolo de revisão da A3 (presencial - 2016.2)\n" +
                "      - Término do período para inscrição em disciplinas (renovação de matrícula - veteranos) - 2017.1");
        fevereiro.add("Dia 6 - Início das aulas - veteranos");
        fevereiro.add("Dia 7 - Término do período para análise da A3 (presencial - 2016.2) pelos docentes");
        fevereiro.add("Dia 9 - Término do período de resposta ao protocolo de revisão da A3 (presencial - 2016.2)\n" +
                "      - Término do período para solicitação de cancelamento de matrícula - calouros - via web");
        fevereiro.add("Dia 15 - Término do período para efetivação de matrícula da graduação presencial (calouros e veteranos)\n" +
                "      - Início do período para solicitação de estudo dirigido – via web");
        fevereiro.add("Dia 17 - Início do período para solicitação de inscrição em monitoria - via web");
        fevereiro.add("Dia 20 - Recálculo dos boletos\n" +
                "      - Término do período para solicitação de estudo dirigido - via web\n" +
                "      - Início das aulas - calouros\n" +
                "      - Início das aulas - disciplina on-line\n" +
                "      - Início da recepção dos calouros 2017.1\n" +
                "      - Início da entrega do modelo de relatório e ficha de avaliação para a disciplina de Estágio Supervisionado e orientação dos alunos - 2017.1");
        fevereiro.add("Dia 22 - Início do período para inscrição em disciplinas em outro campus");
        fevereiro.add("Dia 24 - Término do período para inscrição em disciplinas em outro campus\n" +
                "      - Término da recepção dos calouros 2017.1\n" +
                "      - Término do período para entrega do modelo de relatório e ficha de avaliação para a disciplina de Estágio Supervisionado e orientação dos alunos - 2017.1");
        fevereiro.add("Dia 25 - (não haverá aula)");
        fevereiro.add("Dia 27 - Carnaval (não haverá aula)");
        fevereiro.add("Dia 28 - Carnaval (não haverá aula)");

        List<String> marco = new ArrayList<String>();
        marco.add("Dia 1 - Quarta-Feira de Cinzas - Funcionamento após às 12h, apenas para os Setores de Atendimento (plantão)");
        marco.add("Dia 5 - Avaliação 1 - A1 - 2017.1 - Graduação EAD");
        marco.add("Dia 6 - Início do período de agendamento das provas A2 - 2017.1 - Graduação EAD");
        marco.add("Dia 7 - Término do período para a matrícula das disciplinas on-line.");
        marco.add("Dia 12 - Término do período de agendamento das provas A2 - 2017.1 - Graduação EAD");
        marco.add("Dia 17 - Término do período para inscrições de projetos no Programa de Iniciação Científica - PIC UVA");
        marco.add("Dia 19 - Avaliação 2 - A1 - 2017.1 - Graduação EAD");
        marco.add("Dia 20 - Recálculo dos boletos");
        marco.add("Dia 24 - Início do período de correção de provas A2 presencial\n" +
                "  - Início do período de provas - A2 - 2017.1 - Graduação EAD");
        marco.add("Dia 27 - Término do período de provas - A2 - 2017.1 - Graduação EAD");
        marco.add("Dia 30 - Início do período para solicitação, via protocolo, de revisão de prova da A2 - 2017.1 - Graduação EAD\n" +
                "  - Fórum 1 (on-line) - A1 - Disciplinas on-line\n" +
                "  - Início do período de agendamento das provas A3 - 2017.1 - Graduação EAD");


        List<String> abril = new ArrayList<String>();
        abril.add("Dia 1 - Término do período de correção de provas A2 presencial\n" +
                "  - Data limite para entrega do TCC (EAD)\n" +
                "  - Data limite para entrega da documentação de Estágio Supervisionado (EAD)");
        abril.add("Dia 2 - Término do período de agendamento das provas A3 - 2017.1 - Graduação EAD");
        abril.add("Dia 3 - Início do período de agendamento das provas - A2 presencial\n" +
                "  - Término do período para solicitação, via protocolo, de revisão de prova da A2 - 2017.1 - Graduação EAD");
        abril.add("Dia 7 - Data limite para entrega das Atividades Complementares (EAD)");
        abril.add("Dia 8 - Início do período de provas - A3 - 2017.1 - Graduação EAD\n" +
                "  - Início do período de correção de prova presencial A3\n" +
                "  - Prazo final de correção do Fórum 1 (on-line)");
        abril.add("Dia 9 - Término do período de agendamento das provas - A2 presencial");
        abril.add("Dia 10 - Término do período de provas - A3 - 2017.1 - Graduação EAD");
        abril.add("Dia 12 - Início da solicitação, via protocolo, de revisão de prova da A3 - 2017.1 - Graduação EAD");
        abril.add("Dia 13 - Término do período de correção de prova presencial A3");
        abril.add("Dia 14 - Sexta Feira Santa");
        abril.add("Dia 15 - Sábado de Aleluia");
        abril.add("Dia 16 - Término do período para solicitação, via protocolo, de revisão de prova da A3 - 2017.1 - Graduação EAD");
        abril.add("Dia 17 - Início do período para inscrição em disciplinas 2017.2 - Graduação EAD\n" +
                "  - Início do período para matrícula de calouros 2017.2 - Graduação EAD\n" +
                "  - Início do período para solicitação de mudança de modalidade - presencial para EAD");
        abril.add("Dia 20 - Término do período letivo 2017.1 - Graduação EAD " +
                "  - Recálculo dos Boletos");
        abril.add("Dia 21 - Tiradentes");
        abril.add("Dia 22 - Dia concedido");
        abril.add("Dia 23 - Dia de São Jorge");
        abril.add("Dia 27 - Fórum 2 - A1 - disciplinas on-line");
        abril.add("Dia 28 - Término do período para inscrição em disciplinas 2017.2 - Graduação EAD\n" +
                "  - Término do período para solicitação de mudança de modalidade - presencial para EAD\n" +
                "  - Término do período para matrícula de calouros 2017.2 - Graduação EAD");
        abril.add("Dia 29 - Aula inaugural - 2017.2 - Graduação EAD");

        List<String> maio = new ArrayList<String>();
        maio.add("Dia 1 - Dia do Trabalhador");
        maio.add("Dia 2 - Término do período para solicitação de cancelamento de matrícula - Calouros\n" +
                " - Início das aulas 2017.2 - Graduação EAD");
        maio.add("Dia 6 - Prazo final de correção do Fórum 2 (on-line)");
        maio.add("Dia 12 - Entrega da avaliação A1 - disciplinas on-line");
        maio.add("Dia 19 - Recálculo dos boletos");
        maio.add("Dia 22 - Término do período para correção da avaliação A1 - Disciplinas on-line");
        maio.add("Dia 25 - Início do período de provas A2 - Disciplinas on-line");
        maio.add("Dia 26 - Início do período de correção de prova presencial A2 - Disciplinas on-line");
        maio.add("Dia 28 - Avaliação 1 - A1 - 2017.2 - Graduação EAD");
        maio.add("Dia 29 - Início do período de agendamento das provas A2 - 2017.2 - Graduação EAD");
        maio.add("Dia 31 - Término do período de provas A2 - Disciplinas on-line");


        List<String> junho = new ArrayList<String>();
        junho.add("Dia 4 - Início do período para análise da A3 (presencial - 2016.2) pelos docentes\n" +
                "  - Término do período para solicitação de cancelamento de matrícula - calouros - via web");
        junho.add("Dia 6 - Início do período de agendamento de prova presencial A3 - Disciplinas on-line\n" +
                "  - Início do período de solicitação, via protocolo, de revisão - Prova presencial A2\n" +
                "  - Término do período de correção de prova presencial A2 - Disciplinas on-line");
        junho.add("Dia 9 - Término do período de agendamento de prova presencial A3 - Disciplinas on-line\n" +
                "  - Término do período para solicitação, via protocolo, de revisão - Prova presencial A2");
        junho.add("Dia 15 - Corpus Christi ");
        junho.add("Dia 20 - Recálculo dos boletos");
        junho.add("Dia 21 - Início do período de provas A3 - Disciplinas on-line\n" +
                "  - Início do período de correção de prova presencial A3 - Disciplinas on-line");
        junho.add("Dia 22 - Avaliação 2 - A1 - 2017.2 - Graduação EAD");
        junho.add("Dia 24 - Término do período de provas A3 - Disciplinas on-line");
        junho.add("Dia 29 - Início do período de provas - A2 - 2017.2 - Graduação EAD\n" +
                "  - Início do período de correção de prova presencial A2 - Graduação EAD");
        junho.add("Dia 30 - Término do período de correção de prova presencial A3 - Disciplinas on-line");

        List<String> julho = new ArrayList<String>();
        julho.add("Dia 1 - Término do período de provas - A2 - 2017.2 - Graduação EAD");
        julho.add("Dia 4 - Início do período de agendamento das provas A3 - 2017.2 - Graduação EAD");
        julho.add("Dia 5 - Data limite para entrega do TCC (EAD)\n" +
                "  - Data limite para entrega da documentação de Estágio Supervisionado (EAD)");
        julho.add("Dia 6 - Término do período para solicitação, via protocolo, de revisão de prova da A2 - 2017.2 - Graduação EAD");
        julho.add("Dia 9 - Término do período de agendamento das provas A3 - 2017.2 - Graduação EAD\n" +
                "  - Término do período para solicitação, via protocolo, de revisão de prova da A2 - 2017.2 - Graduação EAD");
        julho.add("Dia 12 - Data limite para entrega das Atividades Complementares (EAD)");
        julho.add("Dia 14 - Início do período de correção de prova presencial A3 - Graduação EAD\n" +
                "   - Início do período de provas A3 - 2017.2 - Graduação EAD");
        julho.add("Dia 15 - Término do período letivo de 2017.2 - Graduação EAD");
        julho.add("Dia 19 -Término do período letivo de 2017.2 - Graduação EAD");
        julho.add("Dia 20 - Término do período para solicitação, via protocolo, de revisão - Prova presencial A3\n" +
                "  - Recálculo dos boletos");
        julho.add("Dia 24 -Início do período para inscrição em disciplinas 2017.3 - Graduação EAD\n" +
                "   - Início do período para solicitação de mudança de modalidade - Presencial para EAD\n" +
                "   - Início do periodo para matrícula de calouros 2017.3 - Graduação EAD");
        julho.add("Dia 25 - Término do período para solicitação, via protocolo, de revisão - Prova presencial A3");
        julho.add("Dia 27 - Início do período para solicitação, via protocolo, de revisão de prova da A3 - 2017.2 - Graduação EAD");
        julho.add("Dia 30 - Término do período para solicitação, via protocolo, de revisão de prova da A3 - 2017.2 - Graduação EAD");

        List<String> agosto = new ArrayList<String>();
        agosto.add("Dia 4 - Término da Inscrição em Disciplinas 2017.3 - Graduação EAD\n" +
                "   - Término da Matrícula de Calouros 2017.3 - Graduação EAD");
        agosto.add("Dia 5 - Aula inaugural - 2017.3 - Graduação EAD");
        agosto.add("Dia 5 - Último dia para solicitação de cancelamento de matrícula - Calouros\n" +
                "   - Início das Aulas 2017.3 - Graduação EAD\n" +
                "   - Término das Férias dos Docentes da Graduação EAD");
        agosto.add("Dia 14 - Dia Concedido somente em Cabo Frio");
        agosto.add("Dia 15 - Padroeira de Cabo Frio - Nossa Senhora de Assunção - somente em CABO FRIO");
        agosto.add("Dia 21 - Recálculo dos boletos\n" +
                "   - Início do período de agendamento das provas A2 - 2017.3 - Graduação EAD");
        agosto.add("Dia 27 - Término do período de agendamento das provas A2 - 2017.3 - Graduação EAD\n" +
                "   - Avaliação 1 - A1 - 2017.3 - Graduação EAD");

        List<String> setembro = new ArrayList<String>();
        setembro.add("Dia 7 - Quarta-Feira de Cinzas - Funcionamento após às 12h, apenas para os Setores de Atendimento (plantão) ");
        setembro.add("Dia 8 - Avaliação 2 - A1 - 2017.3 - Graduação EAD\n" +
                "     - Dia Concedido ");
        setembro.add("Dia 9 - Dia Concedido ");
        setembro.add("Dia 14 - Início do período de Provas - A2 - 2017.3 - Graduação EAD ");
        setembro.add("Dia 16 - Término do período de Provas - A2 - 2017.3 - Graduação EAD ");
        setembro.add("Dia 18 - Início do período de inscrições para o Intercâmbio - via Web");
        setembro.add("Dia 20 - Recálculo dos boletos\n" +
                "     - Início da solicitação, via protocolo, de revisão de prova da A2 - 2017.3 - Graduação EAD\n" +
                "     - Início do período de agendamento das provas A3 - 2017.3 - Graduação EAD");
        setembro.add("Dia 23 - Término da solicitação, via protocolo, de revisão de prova da A2 - 2017.3 - Graduação EAD\n" +
                "     - Término do período de agendamento das provas A3 - 2017.3 - Graduação EAD ");
        setembro.add("Dia 25 - Início da solicitação da Declaração de Presença na Avaliação A1 (Presencial) ");
        setembro.add("Dia 28 - Término do período de inscrições para o Intercâmbio - via Web");
        setembro.add("Dia 30 - Início do período de Provas - A3 - 2017.3 - Graduação EAD");

        List<String> outubro = new ArrayList<String>();

        outubro.add("Dia 2 - Término do período de Provas - A3 - 2017.3 - Graduação EAD\n" +
                " - Início da Matrícula de Calouros 2017.4 - Graduação EAD\n" +
                " - Início da Inscrição em Disciplinas 2017.4 - Graduação EAD");
        outubro.add("Dia 4 - Início da solicitação, via protocolo, de revisão de prova da A3 - 2017.3 - Graduação EAD");
        outubro.add("Dia 5 - Término da solicitação da Declaração de Presença na Avaliação A1 (Presencial)");
        outubro.add("Dia 6 - Término do período letivo de 2017.3 - Graduação EAD");
        outubro.add("Dia 7 - Término da solicitação, via protocolo, de revisão de prova da A3 - 2017.3 - Graduação EAD");
        outubro.add("Dia 12 - Nossa Senhora Aparecida");
        outubro.add("Dia 13 - Dia Concedido\n" +
                "    - Término da Inscrição em Disciplinas 2017.4 - Graduação EAD\n" +
                "    - Término da Matrícula de Calouros 2017.4 - Graduação EAD");
        outubro.add("Dia 14 - Aula Inaugural - 2017.4 - Graduação EAD");
        outubro.add("Dia 15 - Dia do Professor ");
        outubro.add("Dia 16 - Início das Aulas 2017.4 - Graduação EAD");
        outubro.add("Dia 20 - Recálculo dos boletos");

        List<String> novembro = new ArrayList<String>();
        novembro.add("Dia 2 - Dia de Finados");
        novembro.add("Dia 3 - Dia Concedido");
        novembro.add("Dia 4 - Dia Concedido");
        novembro.add("Dia 5 - Avaliação 1 - A1 - 2017.4 - Graduação EAD");
        novembro.add("Dia 6 - Início do período de agendamento das provas A2 - 2017.4 - Graduação EAD");
        novembro.add("Dia 12 - Término do período de agendamento das provas A2 - 2017.4 - Graduação EAD");
        novembro.add("Dia 13 - Aniversário da Cidade de Cabo Frio. (Somente em CABO FRIO)");
        novembro.add("Dia 14 - Dia Concedido somente em Cabo Frio");
        novembro.add("Dia 15 - Proclamação da República");
        novembro.add("Dia 20 - Consciência Negra");
        novembro.add("Dia 21 - Recálculo dos boletos");
        novembro.add("Dia 23 - Início da solicitação da Declaração de Presença na Avaliação A2/A4 (Presencial)");
        novembro.add("Dia 26 - Aplicação da Prova ENADE 2017 - 13:30 horário de Brasília\n" +
                "     - Avaliação 2 - A1 - 2017.4 - Graduação EAD");
        novembro.add("Dia 30 - Início do período de Provas - A2 - 2017.4 - Graduação EAD");

        List<String> dezembro = new ArrayList<String>();
        dezembro.add("Dia 2 - Término do período de Provas - A2 - 2017.4 - Graduação EAD");
        dezembro.add("Dia 4 - Início das atividades da XIV Semana de Iniciação Científica e I seminário de Pesquisa da UVA");
        dezembro.add("Dia 6 - Início da solicitação, via protocolo, de revisão de prova da A2 - 2017.4 - Graduação EAD\n" +
                "     - Início do período de agendamento das provas A3 - 2017.4 - Graduação EAD");
        dezembro.add("Dia 8 - Término das atividades da XIV Semana de Iniciação Científica e I seminário de Pesquisa da UVA");
        dezembro.add("Dia 9 - Término da solicitação, via protocolo, de revisão de prova da A2 - 2017.4 - Graduação EAD\n" +
                "     - Término do período de agendamento das provas A3 - 2017.4 - Graduação EAD");
        dezembro.add("Dia 15 - Início da solicitação da Declaração de Presença na Avaliação A3 (Presencial)\n" +
                "     - Início do período de Provas - A3 - 2017.4 - Graduação EAD ");
        dezembro.add("Dia 16 - Término do período de Provas - A3 - 2017.4 - Graduação EAD ");
        dezembro.add("Dia 20 - Recálculo dos boletos");
        dezembro.add("Dia 21 - Término do período letivo 2017.4 - Graduação EAD\n" +
                "     - Término da solicitação da Declaração de Presença na Avaliação A3 (Presencial)");
        dezembro.add("Dia 22 - Início das Férias Coletivas dos Docentes da Graduação Presencial, EAD e Funcionários Administrativos");
        dezembro.add("Dia 31 - Término das Férias Coletivas dos Docentes da Graduação Presencial, EAD e Funcionários Administrativos");

        List<String> janeiro2 = new ArrayList<String>();
        janeiro2.add("Dia 1 - Dia da Confraternização Universal");
        janeiro2.add("Dia 2 - Início do recesso dos Docentes e Coordenadores da Graduação Presencial e EAD");
        janeiro2.add("Dia 11 - Término do recesso dos Coordenadores da Graduação Presencial e EAD");
        janeiro2.add("Dia 22 - Recálculo dos boletos");
        janeiro2.add("Dia 31 - Término do recesso dos Docentes da Graduação Presencial e EAD");




        listDataChild2.put(listDataHeader2.get(0), janeiro); // Header, Child data
        listDataChild2.put(listDataHeader2.get(1), fevereiro);
        listDataChild2.put(listDataHeader2.get(2), marco);
        listDataChild2.put(listDataHeader2.get(3), abril);
        listDataChild2.put(listDataHeader2.get(4), maio);
        listDataChild2.put(listDataHeader2.get(5), junho);
        listDataChild2.put(listDataHeader2.get(6), julho);
        listDataChild2.put(listDataHeader2.get(7), agosto);
        listDataChild2.put(listDataHeader2.get(8), setembro);
        listDataChild2.put(listDataHeader2.get(9), outubro);
        listDataChild2.put(listDataHeader2.get(10), novembro);
        listDataChild2.put(listDataHeader2.get(11), dezembro);
        listDataChild2.put(listDataHeader2.get(12), janeiro2);


    }
}


