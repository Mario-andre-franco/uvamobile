package mario.spinner.facilita.uvamobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import com.spinner.facilita.uvamobile.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class janeiropresencial extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janeiropresencial);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Janeiro");
        listDataHeader.add("Fevereiro");
        listDataHeader.add("Março");
        listDataHeader.add("Abril");
        listDataHeader.add("Maio");
        listDataHeader.add("Junho");
        listDataHeader.add("Julho");
        listDataHeader.add("Agosto");
        listDataHeader.add("Setembro");
        listDataHeader.add("Novembro");


        // Adding child data
        List<String> janeiro = new ArrayList<String>();
        janeiro.add("Dia 30 - Término do período para mudança de modalidade - EAD para presencial - via web\n" +
                "    - Término do período para reabertura de matrícula para 2017.1 - via web");

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
        marco.add("Dia 2 - Não haverá aula");
        marco.add("Dia 3 - Não haverá aula");
        marco.add("Dia 4 - Não haverá aula");
        marco.add("Dia 6 - Término do período para solicitação de isenção de disciplina");
        marco.add("Dia 10 - Início do período para solicitação de transferência externa\n" +
                "  - Término do período para realizar matrícula, inclusão e exclusão de disciplinas");
        marco.add("Dia 15 - Data limite para solicitação de revisão de dispensa de disciplina\n" +
                "  - Último dia para a matrícula das disciplinas on-line");
        marco.add("Dia 17 - Término do período para solicitação de inscrição em monitoria - via web\n" +
                "  - Término das inscrições de projetos no Programa de Iniciação Científica - PIC UVA");
        marco.add("Dia 20 - Recálculo dos boletos");


        List<String> abril = new ArrayList<String>();
        abril.add("Dia 3 - Início do período de agendamento das provas - A2 janeiropresencial");
        abril.add("Dia 4 - Início do período para dar entrada em solicitação de reabertura de matrícula, transferência externa e portador de diploma para 2017.2");
        abril.add("Dia 5 - Início do período de provas - A1\" \n" +
                "  - Início do período de lançamento de notas pelo professor - A1 - NetTeacher");
        abril.add("Dia 6 - Fórum 1 (on-line) - A1 - disciplinas on-line");
        abril.add("Dia 9 - Término do período de agendamento das provas - A2");
        abril.add("Dia 14 - Sexta Feira Santa (não haverá aula)");
        abril.add("Dia 15 - Sábado de Aleluia n\" +\n" +
                "  - Prazo final de correção do Fórum 1 (on-line)");
        abril.add("Dia 20 - Recálculo dos boletos");
        abril.add("Dia 21 - Tiradentes (não haverá aula)");
        abril.add("Dia 22 - Dia concedido");
        abril.add("Dia 23 - Dia de São Jorge");
        abril.add("Dia 27 - Fórum 2 - A1 - disciplinas on-line");

        List<String> maio = new ArrayList<String>();
        maio.add("Dia 1 - Dia do Trabalhador (não haverá aula)");
        maio.add("Dia 2 - Início do período para acompanhamento de estágio e esclarecimento de dúvidas dos alunos - 2017.1");
        maio.add("Dia 6 - Término do período para acompanhamento de estágio e esclarecimento de dúvidas dos alunos - 2017.1\n" +
                " - Prazo final de correção do Fórum 2 (on-line)");
        maio.add("Dia 12 - Entrega da avaliação: A1 - disciplinas online");
        maio.add("Dia 19 - Recálculo dos boletos");
        maio.add("Dia 22 - Prazo final de correção da avaliação - A1 - disciplinas on-line");
        maio.add("Dia 25 - Início do período de provas A2 - disciplinas on-line");
        maio.add("Dia 26 - Início do período de correção de prova janeiropresencial A2 - disciplinas on-line");
        maio.add("Dia 28 - Avaliação 1 - A1 - 2017.2 - Graduação EAD");
        maio.add("Dia 29 - Início do período de agendamento das provas A2- 2017.2 - Graduação EAD");
        maio.add("Dia 31 - Término do período de provas A2: Disciplinas on-line");


        List<String> junho = new ArrayList<String>();
        junho.add("Dia 1 - Início do período de provas - A2/A4");
        junho.add("Dia 5 - Início do período de entrega do Kit Estágio - 2017.1 ");
        junho.add("Dia 6 - Início do período de agendamento de prova A3 - Disciplinas on-line\n" +
                "  - Início do período para solicitação, via protocolo, de revisão - Prova A2\n" +
                "  - Término do período de correção de prova A2 - Disciplinas on-line");
        junho.add("Dia 7 - Término do período de provas - A2/A4");
        junho.add("Dia 9 - Término do período de agendamento de prova A3 - Disciplinas on-line\n" +
                "  - Término do período para solicitação, via protocolo, de revisão -A2");
        junho.add("Dia 13 - Data limite para entrega de estágio\n" +
                "  - Término do período de entrega do Kit Estágio - 2017.1");
        junho.add("Dia 15 - Corpus Christi (não haverá aula) ");
        junho.add("Dia 16 - Dia concedido (não haverá aula)");
        junho.add("Dia 17 - Dia concedido (não haverá aula)");
        junho.add("Dia 20 - Recálculo dos boletos");
        junho.add("Dia 21 - Início do período de provas - A3\n" +
                "  - Início do período de provas - A3 disciplinas on-line\n" +
                "  - Início do período de correção de prova A3 - Disciplinas on-line");
        junho.add("Dia 24 - Término do período de provas - A3 disciplinas on-line");
        junho.add("Dia 27 - Término do período de provas - A3 ");
        junho.add("Dia 30 - Término do período de correção de prova A3 - Disciplinas on-line");

        List<String> julho = new ArrayList<String>();
        julho.add("Dia 3 - Início do período para solicitação da cópia da A3 (2017.1) - via web\n" +
                "  - Início do período para o DAE digitalizar as provas de A3 (2017.1), solicitadas pelo protocolo Cópia de Prova");
        julho.add("Dia 5 - Término do período letivo de 2017.1");
        julho.add("Dia 7 - Término do período para solicitação da cópia da A3 (2017.1) - via web");
        julho.add("Dia 8 - Término do período para o DAE digitalizar as provas de A3 (2017.1), solicitadas através do protocolo Cópia de Prova");
        julho.add("Dia 10 - Início do prazo para solicitação da Revisão da A3 (2017.1)");
        julho.add("Dia 12 - Data limite para entrega das Atividades Complementares e TCC Graduação  - 2017.1");
        julho.add("Dia 14 - Término do período para solicitação da revisão da A3 (2017.1)");
        julho.add("Dia 15 - Início do período de Inscrição em disciplinas (renovação de matrícula - veteranos) - 2017.2");
        julho.add("Dia 17 - Início do período para solicitação de estudo dirigido - via web");
        julho.add("Dia 20 - Início do período de solicitação via protocolo de revisão - A3\n" +
                "  - Recálculo dos boletos");
        julho.add("Dia 24 - Início do período para solicitação de inscrição em monitoria, via presencial\n" +
                "  - Término do período para inclusão e/ou exclusão de disciplinas, troca de turmas e efetivação de matrícula, via web, para os cursos ENADE 2017");
        julho.add("Dia 25 - Início do preenchimento do Termo de Ciência, via web, para os alunos ENADE 2017 ao realizarem a matrícula fora do prazo.\n" +
                "  - Término do período de solicitação via protocolo de revisão - Prova A3");
        julho.add("Dia 26 - Início das aulas - veteranos \n" +
                "  - Início do período para análise da A3- 2017.1) pelos docentes emitirem paracer");
        julho.add("Dia 27 - Início das aulas - Calouros");

        List<String> agosto = new ArrayList<String>();
        agosto.add("Dia 1 - Início das Aulas - Calouros\n" +
                "   - Início do período para Análise da A3 (Presencial - 2017.1) pelos docentes emitirem paracer\n" +
                "   - Término do período para solicitação de Inscrição em Monitoria, via presencial");
        agosto.add("Dia 2 - Início das Aulas - Veteranos");
        agosto.add("Dia 4 - Término da solicitação de mudança de modalidade - Presencial para EAD 2017.3");
        agosto.add("Dia 5 - Término do período para Análise da A3 (Presencial - 2017.1) pelos docentes emitirem paracer");
        agosto.add("Dia 7 - Início do período de encontro com os alunos para orientação de estágio - 2017.2");
        agosto.add("Dia 9 - Início das aulas - Disciplina on-line");
        agosto.add("Dia 11 - Término das inscrições, no INEP, dos alunos habilitados (regulares) ao Enade 2017 (art.5º da Portaria Normativa nº 08, de 26/04/17)\n" +
                "   - Término do período de encontro com os alunos para orientação de Estágio - 2017.2");
        agosto.add("Dia 14 - Dia Concedido somente em Cabo Frio (não haverá aula)");
        agosto.add("Dia 15 - Padroeira de Cabo Frio - Nossa Senhora de Assunção - somente em Cabo Frio");
        agosto.add("Dia 16 - Início do prazo para solicitação da reanálise de dispensa em disciplinas - via web");
        agosto.add("Dia 21 - Término do prazo para solicitação, via protocolo, Mudança de Campus/Curso/Turno, Modalidade EAD para Presencial - (Calouros e Veteranos) - 2017.2 - via Web\n" +
                "   - Término do prazo para solicitação da Reabertura de Matrícula, Transferência Externa e portador de Diploma para 2017.2, via Web\n"+
                "   - Recálculo dos boletos");
        agosto.add("Dia 25 - Último dia para a matrícula das Disc. On line\n" +
                "   - Data limite ref. aos 25% de faltas permitidas pelo MEC");



        List<String> setembro = new ArrayList<String>();
        setembro.add("Dia 6 - Data limite para solicitação de cancelamento de matrícula - veteranos e calouros - via web\n" +
                "     - Término do período para solicitação de reanálise de dispensa em disciplinas - via web\n" +
                "     - Término do período para solicitação da reanálise de dispensa em disciplinas - via web");
        setembro.add("Dia 7 - Independência do Brasil (não haverá aula)");
        setembro.add("Dia 8 - Dia concedido (não haverá aula)");
        setembro.add("Dia 9 - Dia Concedido (não haverá aula)");
        setembro.add("Dia 11 - Data limite para resposta da solicitação do protocolo de Estudo dirigido\n" +
                "     - Término do prazo para solicitação da Reanálise de Dispensa em Disciplinas - via Web");
        setembro.add("Dia 14 - Início do período de provas - A1");
        setembro.add("Dia 18 - Início do período de inscrições para o Intercâmbio - via Web");
        setembro.add("Dia 20 - Recálculo dos boletos\n" +
                "     - Término do período de Provas - A1 (presencial)");
        setembro.add("Dia 25 - Início da solicitação da Declaração de Presença na Avaliação A1 (Presencial)");
        setembro.add("Dia 28 - Término do período de inscrições para o Intercâmbio - via Web\n" +
                "     - Avaliação 1 - A1 - Disciplinas Online");


        List<String> outubro = new ArrayList<String>();
        outubro.add("Dia 2 - Início do período de agendamento de prova presencial A2 - Disciplinas Online\n" +
                " -  Início da solicitação de mudança de modalidade - Presencial para EAD - 2017.4");
        outubro.add("Dia 5 - Avaliação 2 - A1 - Disciplinas Online\n" +
                " -  Término da solicitação da Declaração de Presença na Avaliação A1 (Presencial)");
        outubro.add("Dia 8 - Término do período de agendamento de prova presencial A2 - Disciplinas Online");
        outubro.add("Dia 12 - Nossa Senhora Aparecida");
        outubro.add("Dia 13 - Dia Concedido\n" +
                "    - Término da solicitação de mudança de modalidade - Presencial para EAD - 2017.4");
        outubro.add("Dia 14 - Dia Concedido");
        outubro.add("Dia 15 - Dia do Professor");
        outubro.add("Dia 16 - Dia concedido somente para os Docentes - Não haverá aula\n" +
                " -  Início do período de encontro com alunos para esclarecimento de dúvidas/orientação dos que ainda não estão estagiando - 2017.2");
        outubro.add("Dia 19 - Avaliação 3 - A1 - Disciplinas Online");
        outubro.add("Dia 20 - Término do período de encontro com alunos para esclarecimento de dúvidas/orientação dos que ainda não estão estagiando - 2017.2\n" +
                "    - Recálculo dos boletos");


        List<String> novembro = new ArrayList<String>();
        novembro.add("Dia 2 - Dia de Finados ");
        novembro.add("Dia 3 - Dia Concedido ");
        novembro.add("Dia 4 - Dia Concedido");
        novembro.add("Dia 9 - Avaliação 4 - A1 - Disciplinas Online");
        novembro.add("Dia 13 - Aniversário da Cidade de Cabo Frio. (Somente em CABO FRIO)");
        novembro.add("Dia 14 - Dia Concedido somente em Cabo Frio");
        novembro.add("Dia 15 - Proclamação da República");
        novembro.add("Dia 20 - Consciência Negra");
        novembro.add("Dia 21 - Início do prazo para solicitação, via protocolo, Mudança de Campus/Curso/Turno, Modalidade EAD para Presencial - (Calouros e Veteranos) - 2018.1 - via Web\n" +
                " - Início do prazo para solicitação, via protocolo, da Reabertura de Matrícula, Transferência Externa e Portador de Diploma para 2018.1, via Web\n" +
                " - Início do período de provas A2 presencial - Disciplinas Online\n" +
                " - Recálculo dos boletos ");
        novembro.add("Dia 23 - Início do período de Provas - A2/A4 (presencial)\n" +
                "     - Início da solicitação da Declaração de Presença na Avaliação A2/A4 (Presencial)");
        novembro.add("Dia 25 - Término do período de provas A2 presencial - Disciplinas Online ");


        listDataChild.put(listDataHeader.get(0), janeiro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), fevereiro);
        listDataChild.put(listDataHeader.get(2), marco);
        listDataChild.put(listDataHeader.get(3), abril);
        listDataChild.put(listDataHeader.get(4), maio);
        listDataChild.put(listDataHeader.get(5), junho);
        listDataChild.put(listDataHeader.get(6), julho);
        listDataChild.put(listDataHeader.get(7), agosto);
        listDataChild.put(listDataHeader.get(8), setembro);
        listDataChild.put(listDataHeader.get(9), novembro);
    }
}




        /*listDataChild.put(listDataHeader.get(9), outubro);
        listDataChild.put(listDataHeader.get(10), novembro);
        listDataChild.put(listDataHeader.get(11), dezembro);
        /*List<String> outubro = new ArrayList<String>();
        outubro.add("Dia 1 - Início do período de provas - A2/A4 (janeiropresencial)");
        junho.add("Dia 5 - Início do período de entrega do Kit Estágio - 2017.1 ");
        junho.add("Dia 6 - Início do período de agendamento de prova janeiropresencial A3 - Disciplinas on-line\n" +
                "  - Início do período para solicitação, via protocolo, de revisão - Prova janeiropresencial A2\n" +
                "  - Término do período de correção de prova janeiropresencial A2 - Disciplinas on-line");
        junho.add("Dia 7 - Término do período de provas - A2/A4 (janeiropresencial)");
        junho.add("Dia 9 - Término do período de agendamento de prova janeiropresencial A3 - Disciplinas on-line\n" +
                "  - Término do período para solicitação, via protocolo, de revisão - Prova janeiropresencial A2");
        junho.add("Dia 13 - Data limite para entrega de estágio\n" +
                "  - Término do período de entrega do Kit Estágio - 2017.1");
        junho.add("Dia 15 - Corpus Christi (não haverá aula) ");
        junho.add("Dia 16 - Dia concedido (não haverá aula)");
        junho.add("Dia 17 - Dia concedido (não haverá aula)");
        junho.add("Dia 20 - Recálculo dos boletos");
        junho.add("Dia 21 - Início do período de provas - A3 (janeiropresencial)\n" +
                "  - Início do período de provas - A3 disciplinas on-line\n" +
                "  - Início do período de correção de prova janeiropresencial A3 - Disciplinas on-line");
        junho.add("Dia 24 - Término do período de provas - A3 disciplinas on-line");
        junho.add("Dia 27 - Término do período de provas - A3 (janeiropresencial)");
        junho.add("Dia 30 - Término do período de correção de prova janeiropresencial A3 - Disciplinas on-line");


        List<String> novembro = new ArrayList<String>();
        junho.add("Dia 1 - Início do período de provas - A2/A4 (janeiropresencial)");
        junho.add("Dia 5 - Início do período de entrega do Kit Estágio - 2017.1 ");
        junho.add("Dia 6 - Início do período de agendamento de prova janeiropresencial A3 - Disciplinas on-line\n" +
                "  - Início do período para solicitação, via protocolo, de revisão - Prova janeiropresencial A2\n" +
                "  - Término do período de correção de prova janeiropresencial A2 - Disciplinas on-line");
        junho.add("Dia 7 - Término do período de provas - A2/A4 (janeiropresencial)");
        junho.add("Dia 9 - Término do período de agendamento de prova janeiropresencial A3 - Disciplinas on-line\n" +
                "  - Término do período para solicitação, via protocolo, de revisão - Prova janeiropresencial A2");
        junho.add("Dia 13 - Data limite para entrega de estágio\n" +
                "  - Término do período de entrega do Kit Estágio - 2017.1");
        junho.add("Dia 15 - Corpus Christi (não haverá aula) ");
        junho.add("Dia 16 - Dia concedido (não haverá aula)");
        junho.add("Dia 17 - Dia concedido (não haverá aula)");
        junho.add("Dia 20 - Recálculo dos boletos");
        junho.add("Dia 21 - Início do período de provas - A3 (janeiropresencial)\n" +
                "  - Início do período de provas - A3 disciplinas on-line\n" +
                "  - Início do período de correção de prova janeiropresencial A3 - Disciplinas on-line");
        junho.add("Dia 24 - Término do período de provas - A3 disciplinas on-line");
        junho.add("Dia 27 - Término do período de provas - A3 (janeiropresencial)");
        junho.add("Dia 30 - Término do período de correção de prova janeiropresencial A3 - Disciplinas on-line");


        List<String> dezembro = new ArrayList<String>();
        junho.add("Dia 1 - Início do período de provas - A2/A4 (janeiropresencial)");
        junho.add("Dia 5 - Início do período de entrega do Kit Estágio - 2017.1 ");
        junho.add("Dia 6 - Início do período de agendamento de prova janeiropresencial A3 - Disciplinas on-line\n" +
                "  - Início do período para solicitação, via protocolo, de revisão - Prova janeiropresencial A2\n" +
                "  - Término do período de correção de prova janeiropresencial A2 - Disciplinas on-line");
        junho.add("Dia 7 - Término do período de provas - A2/A4 (janeiropresencial)");
        junho.add("Dia 9 - Término do período de agendamento de prova janeiropresencial A3 - Disciplinas on-line\n" +
                "  - Término do período para solicitação, via protocolo, de revisão - Prova janeiropresencial A2");
        junho.add("Dia 13 - Data limite para entrega de estágio\n" +
                "  - Término do período de entrega do Kit Estágio - 2017.1");
        junho.add("Dia 15 - Corpus Christi (não haverá aula) ");
        junho.add("Dia 16 - Dia concedido (não haverá aula)");
        junho.add("Dia 17 - Dia concedido (não haverá aula)");
        junho.add("Dia 20 - Recálculo dos boletos");
        junho.add("Dia 21 - Início do período de provas - A3 (janeiropresencial)\n" +
                "  - Início do período de provas - A3 disciplinas on-line\n" +
                "  - Início do período de correção de prova janeiropresencial A3 - Disciplinas on-line");
        junho.add("Dia 24 - Término do período de provas - A3 disciplinas on-line");
        junho.add("Dia 27 - Término do período de provas - A3 (janeiropresencial)");
        junho.add("Dia 30 - Término do período de correção de prova janeiropresencial A3 - Disciplinas on-line");


        listDataChild.put(listDataHeader.get(0), janeiro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), fevereiro);
        listDataChild.put(listDataHeader.get(2), marco);
        listDataChild.put(listDataHeader.get(3), abril);
        listDataChild.put(listDataHeader.get(4), maio);
        listDataChild.put(listDataHeader.get(5), junho);
        listDataChild.put(listDataHeader.get(6), julho);
        listDataChild.put(listDataHeader.get(7), agosto);
        listDataChild.put(listDataHeader.get(8), setembro);
        listDataChild.put(listDataHeader.get(9), outubro);
        listDataChild.put(listDataHeader.get(10), novembro);
        listDataChild.put(listDataHeader.get(11), dezembro);*/
