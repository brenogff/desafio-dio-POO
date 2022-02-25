import java.time.LocalDate;

public class Programa {

    
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");
        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Breno: " + devBreno.getConteudosInscritos());
        devBreno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Breno: " + devBreno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Breno: " + devBreno.getConteudosInscritos());
        System.out.println("XP:" + devBreno.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
    
}
