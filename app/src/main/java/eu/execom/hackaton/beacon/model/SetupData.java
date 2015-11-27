package eu.execom.hackaton.beacon.model;

import java.util.List;

/**
 * Created by Blaz on 27.11.2015.
 */
public class SetupData {

    private List<Section> listOfSections;
    private List<Book> listOfBooks;
    private List<Author> listOfAuthors;

    public void SetupData() {
        //AUTHORS
        //english
        Author rowling = new Author();
        rowling.setIdAuthor(1);
        rowling.setName("Joanne");
        rowling.setLastName("Rowling");

        //physics
        Author randallMunroe = new Author();
        randallMunroe.setIdAuthor(2);
        randallMunroe.setName("Randall");
        randallMunroe.setLastName("Munroe");

        Author stephenHawking = new Author();
        stephenHawking.setIdAuthor(3);
        stephenHawking.setName("Stephen");
        stephenHawking.setLastName("Hawking");

        Author chrisHadfield = new Author();
        chrisHadfield.setIdAuthor(4);
        chrisHadfield.setName("Chris");
        chrisHadfield.setLastName("Hadfield");

        Author henryCooper = new Author();
        henryCooper.setIdAuthor(5);
        henryCooper.setName("Henry");
        henryCooper.setLastName("Cooper");

        Author michioKaku = new Author();
        michioKaku.setIdAuthor(6);
        michioKaku.setName("Michio");
        michioKaku.setLastName("Kaku");

        Author albertEinstein = new Author();
        albertEinstein.setIdAuthor(7);
        albertEinstein.setName("Albert");
        albertEinstein.setLastName("Einstein");

        Author darrellHuff = new Author();
        darrellHuff.setIdAuthor(8);
        darrellHuff.setName("Darrell");
        darrellHuff.setLastName("Huff");

        Author kipThorne = new Author();
        kipThorne.setIdAuthor(9);
        kipThorne.setName("Kip");
        kipThorne.setLastName("Thorne");

        Author gregYoung = new Author();
        gregYoung.setIdAuthor(10);
        gregYoung.setName("Kip");
        gregYoung.setLastName("Thorne");

        Author stephenKing = new Author();
        stephenKing.setIdAuthor(11);
        stephenKing.setName("Stephen");
        stephenKing.setLastName("Hawking");

        //arts
        Author barneyDavey = new Author();
        barneyDavey.setIdAuthor(12);
        barneyDavey.setName("Barney");
        barneyDavey.setLastName("Davey");

        Author juliaCameron = new Author();
        juliaCameron.setIdAuthor(13);
        juliaCameron.setName("Julia");
        juliaCameron.setLastName("Cameron");

        Author alysonStanfield = new Author();
        alysonStanfield.setIdAuthor(14);
        alysonStanfield.setName("Alyson");
        alysonStanfield.setLastName("Stanfield");

        Author maryBostic = new Author();
        maryBostic.setIdAuthor(15);
        maryBostic.setName("Mary");
        maryBostic.setLastName("Bostic");

        Author jasonHorejs = new Author();
        jasonHorejs.setIdAuthor(16);
        jasonHorejs.setName("Jason");
        jasonHorejs.setLastName("Horejs");

        Author carollMichael = new Author();
        carollMichael.setIdAuthor(17);
        carollMichael.setName("Caroll");
        carollMichael.setLastName("Michael");

        Author malloryWhitfield = new Author();
        malloryWhitfield.setIdAuthor(18);
        malloryWhitfield.setName("Mallory");
        malloryWhitfield.setLastName("Whitfield");

        Author taraReed = new Author();
        taraReed.setIdAuthor(19);
        taraReed.setName("Tara");
        taraReed.setLastName("Reed");


        //SECTIONS
        //history
        Section history = new Section();
        history.setIdSection(1);
        history.setName("History");

        //art
        Section art = new Section();
        art.setIdSection(2);
        art.setName("Arts");

        //english
        Section english = new Section();
        english.setIdSection(3);
        english.setName("English");

        //physics
        Section physics = new Section();
        physics.setIdSection(4);
        physics.setName("Physics");

        //economics
        Section economics = new Section();
        economics.setIdSection(5);
        economics.setName("Economics");

        //BOOKS
        //english
        Book philosophers = new Book();
        philosophers.setIdBook(1);
        philosophers.setTitle("Harry Potter and the Philosopher's Stone");
        philosophers.setAuthor(rowling);
        philosophers.setSection(english);

        Book chamber = new Book();
        chamber.setIdBook(2);
        chamber.setTitle("Harry Potter and the Chamber of Secrets");
        chamber.setAuthor(rowling);
        chamber.setSection(english);

        Book azkaban = new Book();
        azkaban.setIdBook(3);
        azkaban.setTitle("Harry Potter and the Prisoner from Azkaban");
        azkaban.setAuthor(rowling);
        azkaban.setSection(english);

        Book fire = new Book();
        fire.setIdBook(4);
        fire.setTitle("Harry Potter and the Goblet of Fire");
        fire.setAuthor(rowling);
        fire.setSection(english);

        Book phoenix = new Book();
        phoenix.setIdBook(5);
        phoenix.setTitle("Harry Potter and the Order of the Phoenix");
        phoenix.setAuthor(rowling);
        phoenix.setSection(english);

        Book prince = new Book();
        prince.setIdBook(6);
        prince.setTitle("Harry Potter and the Half-Blood Prince");
        prince.setAuthor(rowling);
        prince.setSection(english);

        //physics
        Book whatIf = new Book();
        whatIf.setIdBook(7);
        whatIf.setTitle("What if");
        whatIf.setAuthor(randallMunroe);
        whatIf.setSection(physics);

        Book historyOfTime = new Book();
        historyOfTime.setIdBook(8);
        historyOfTime.setTitle("A brief history of time");
        historyOfTime.setAuthor(stephenHawking);
        historyOfTime.setSection(physics);

        Book hallows = new Book();
        hallows.setIdBook(9);
        hallows.setTitle("An Astronauts Guide to Life on Earth");
        hallows.setAuthor(randallMunroe);
        hallows.setSection(physics);

        Book apollo = new Book();
        apollo.setIdBook(10);
        apollo.setTitle("Thirteen: The Apollo Flight That Failed");
        apollo.setAuthor(henryCooper);
        apollo.setSection(physics);

        Book futureOfMind = new Book();
        futureOfMind.setIdBook(11);
        futureOfMind.setTitle("The future of the Mind");
        futureOfMind.setAuthor(michioKaku);
        futureOfMind.setSection(physics);

        Book lieWithStatistics = new Book();
        lieWithStatistics.setIdBook(12);
        lieWithStatistics.setTitle("How to lie with statistics");
        lieWithStatistics.setAuthor(darrellHuff);
        lieWithStatistics.setSection(physics);

        Book einsteinLifeUniverse = new Book();
        einsteinLifeUniverse.setIdBook(13);
        einsteinLifeUniverse.setTitle("Einstein: His life and universe");
        einsteinLifeUniverse.setAuthor(albertEinstein);
        einsteinLifeUniverse.setSection(physics);

        Book scienceOfInterstellar = new Book();
        scienceOfInterstellar.setIdBook(14);
        scienceOfInterstellar.setTitle("The science of insterstellar");
        scienceOfInterstellar.setAuthor(kipThorne);
        scienceOfInterstellar.setSection(physics);

        Book satSubjectTest = new Book();
        satSubjectTest.setIdBook(15);
        satSubjectTest.setTitle("Barron’s SAT Subject Test: Physics");
        satSubjectTest.setAuthor(gregYoung);
        satSubjectTest.setSection(physics);

        Book shinning = new Book();
        shinning.setIdBook(16);
        shinning.setTitle("The shinning");
        shinning.setAuthor(stephenKing);
        shinning.setSection(physics);

        Book blackHouse = new Book();
        blackHouse.setIdBook(17);
        blackHouse.setTitle("Black house");
        blackHouse.setAuthor(stephenKing);
        blackHouse.setSection(physics);

        //arts
        Book guerillaMarketing = new Book();
        guerillaMarketing.setIdBook(18);
        guerillaMarketing.setTitle("Guerrilla Marketing for Artists");
        guerillaMarketing.setAuthor(barneyDavey);
        guerillaMarketing.setSection(art);

        Book artistsWay = new Book();
        artistsWay.setIdBook(19);
        artistsWay.setTitle("The Artists Way");
        artistsWay.setAuthor(juliaCameron);
        artistsWay.setSection(art);

        Book idRatherBe = new Book();
        idRatherBe.setIdBook(20);
        idRatherBe.setTitle("I’d Rather Be in the Studio");
        idRatherBe.setAuthor(alysonStanfield);
        idRatherBe.setSection(art);

        Book artistGraphicDesigner = new Book();
        artistGraphicDesigner.setIdBook(21);
        artistGraphicDesigner.setTitle("2015 Artist’s & Graphic Designer’s Market");
        artistGraphicDesigner.setAuthor(maryBostic);
        artistGraphicDesigner.setSection(art);

        Book starvingToSUccessful = new Book();
        starvingToSUccessful.setIdBook(22);
        starvingToSUccessful.setTitle("Starving” to Successful");
        starvingToSUccessful.setAuthor(jasonHorejs);
        starvingToSUccessful.setSection(art);

        Book surviveProsper = new Book();
        surviveProsper.setIdBook(23);
        surviveProsper.setTitle("How to Survive and Prosper as an Artist");
        surviveProsper.setAuthor(carollMichael);
        surviveProsper.setSection(art);

        Book sellArt = new Book();
        sellArt.setIdBook(24);
        sellArt.setTitle("How to Sell Art to Interior Designers");
        sellArt.setAuthor(barneyDavey);
        sellArt.setSection(art);

        Book makeMoney = new Book();
        makeMoney.setIdBook(25);
        makeMoney.setTitle("How to Make Money at Craft Shows");
        makeMoney.setAuthor(malloryWhitfield);
        makeMoney.setSection(art);

        Book artLicensing = new Book();
        artLicensing.setIdBook(26);
        artLicensing.setTitle("How to Get Started in Art Licensing");
        artLicensing.setAuthor(taraReed);
        artLicensing.setSection(art);



        //LOCATIONS
    }

}
