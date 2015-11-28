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
        listOfAuthors.add(rowling);

        //physics
        Author randallMunroe = new Author();
        randallMunroe.setIdAuthor(2);
        randallMunroe.setName("Randall");
        randallMunroe.setLastName("Munroe");
        listOfAuthors.add(randallMunroe);

        Author stephenHawking = new Author();
        stephenHawking.setIdAuthor(3);
        stephenHawking.setName("Stephen");
        stephenHawking.setLastName("Hawking");
        listOfAuthors.add(stephenHawking);

        Author chrisHadfield = new Author();
        chrisHadfield.setIdAuthor(4);
        chrisHadfield.setName("Chris");
        chrisHadfield.setLastName("Hadfield");
        listOfAuthors.add(chrisHadfield);

        Author henryCooper = new Author();
        henryCooper.setIdAuthor(5);
        henryCooper.setName("Henry");
        henryCooper.setLastName("Cooper");
        listOfAuthors.add(henryCooper);

        Author michioKaku = new Author();
        michioKaku.setIdAuthor(6);
        michioKaku.setName("Michio");
        michioKaku.setLastName("Kaku");
        listOfAuthors.add(michioKaku);

        Author albertEinstein = new Author();
        albertEinstein.setIdAuthor(7);
        albertEinstein.setName("Albert");
        albertEinstein.setLastName("Einstein");
        listOfAuthors.add(albertEinstein);

        Author darrellHuff = new Author();
        darrellHuff.setIdAuthor(8);
        darrellHuff.setName("Darrell");
        darrellHuff.setLastName("Huff");
        listOfAuthors.add(darrellHuff);

        Author kipThorne = new Author();
        kipThorne.setIdAuthor(9);
        kipThorne.setName("Kip");
        kipThorne.setLastName("Thorne");
        listOfAuthors.add(kipThorne);

        Author gregYoung = new Author();
        gregYoung.setIdAuthor(10);
        gregYoung.setName("Kip");
        gregYoung.setLastName("Thorne");
        listOfAuthors.add(gregYoung);

        Author stephenKing = new Author();
        stephenKing.setIdAuthor(11);
        stephenKing.setName("Stephen");
        stephenKing.setLastName("Hawking");
        listOfAuthors.add(stephenKing);

        //arts
        Author barneyDavey = new Author();
        barneyDavey.setIdAuthor(12);
        barneyDavey.setName("Barney");
        barneyDavey.setLastName("Davey");
        listOfAuthors.add(barneyDavey);

        Author juliaCameron = new Author();
        juliaCameron.setIdAuthor(13);
        juliaCameron.setName("Julia");
        juliaCameron.setLastName("Cameron");
        listOfAuthors.add(juliaCameron);

        Author alysonStanfield = new Author();
        alysonStanfield.setIdAuthor(14);
        alysonStanfield.setName("Alyson");
        alysonStanfield.setLastName("Stanfield");
        listOfAuthors.add(alysonStanfield);

        Author maryBostic = new Author();
        maryBostic.setIdAuthor(15);
        maryBostic.setName("Mary");
        maryBostic.setLastName("Bostic");
        listOfAuthors.add(maryBostic);

        Author jasonHorejs = new Author();
        jasonHorejs.setIdAuthor(16);
        jasonHorejs.setName("Jason");
        jasonHorejs.setLastName("Horejs");
        listOfAuthors.add(jasonHorejs);

        Author carollMichael = new Author();
        carollMichael.setIdAuthor(17);
        carollMichael.setName("Caroll");
        carollMichael.setLastName("Michael");
        listOfAuthors.add(carollMichael);

        Author malloryWhitfield = new Author();
        malloryWhitfield.setIdAuthor(18);
        malloryWhitfield.setName("Mallory");
        malloryWhitfield.setLastName("Whitfield");
        listOfAuthors.add(malloryWhitfield);

        Author taraReed = new Author();
        taraReed.setIdAuthor(19);
        taraReed.setName("Tara");
        taraReed.setLastName("Reed");
        listOfAuthors.add(taraReed);

        //history
        Author charlesDarvin = new Author();
        charlesDarvin.setIdAuthor(20);
        charlesDarvin.setName("Charles");
        charlesDarvin.setLastName("Darvin");
        listOfAuthors.add(charlesDarvin);


        Author kingJames = new Author();
        kingJames.setIdAuthor(21);
        kingJames.setName("King");
        kingJames.setLastName("James");
        listOfAuthors.add(kingJames);

        Author islam = new Author();
        islam.setIdAuthor(22);
        islam.setName("Islam");
        islam.setLastName("Islam");
        listOfAuthors.add(islam);

        Author karlMarx = new Author();
        karlMarx.setIdAuthor(23);
        karlMarx.setName("Karl");
        karlMarx.setLastName("Marx");
        listOfAuthors.add(karlMarx);

        Author plato = new Author();
        plato.setIdAuthor(24);
        plato.setName("Plato");
        plato.setLastName("Plato");
        listOfAuthors.add(plato);

        Author georgeOrwell = new Author();
        georgeOrwell.setIdAuthor(25);
        georgeOrwell.setName("George");
        georgeOrwell.setLastName("Orwell");
        listOfAuthors.add(georgeOrwell);

        Author williamShakespeare = new Author();
        williamShakespeare.setIdAuthor(26);
        williamShakespeare.setName("William");
        williamShakespeare.setLastName("Shakespeare");
        listOfAuthors.add(williamShakespeare);

        Author niccoloMacchiavelli = new Author();
        niccoloMacchiavelli.setIdAuthor(27);
        niccoloMacchiavelli.setName("Nicolo");
        niccoloMacchiavelli.setLastName("Macchiavelli");
        listOfAuthors.add(niccoloMacchiavelli);

        Author homer = new Author();
        homer.setIdAuthor(28);
        homer.setName("Homer");
        homer.setLastName("Homer");
        listOfAuthors.add(homer);

        //economics

        Author richardThaler = new Author();
        richardThaler.setIdAuthor(29);
        richardThaler.setName("Richard");
        richardThaler.setLastName("Thaler");
        listOfAuthors.add(richardThaler);

        Author thomasPikketty = new Author();
        thomasPikketty.setIdAuthor(30);
        thomasPikketty.setName("Thomas");
        thomasPikketty.setLastName("Pikketty");
        listOfAuthors.add(thomasPikketty);

        Author benjaminGraham = new Author();
        benjaminGraham.setIdAuthor(31);
        benjaminGraham.setName("Benjamin");
        benjaminGraham.setLastName("Graham");
        listOfAuthors.add(benjaminGraham);

        Author peterThiel = new Author();
        peterThiel.setIdAuthor(32);
        peterThiel.setName("Peter");
        peterThiel.setLastName("Thiel");
        listOfAuthors.add(peterThiel);

        Author friedrichHayek = new Author();
        friedrichHayek.setIdAuthor(33);
        friedrichHayek.setName("Friedrich");
        friedrichHayek.setLastName("Hayek");
        listOfAuthors.add(friedrichHayek);

        Author timHardfor = new Author();
        timHardfor.setIdAuthor(34);
        timHardfor.setName("Tim");
        timHardfor.setLastName("Hardfor");
        listOfAuthors.add(timHardfor);

        Author miltonFriedman = new Author();
        miltonFriedman.setIdAuthor(35);
        miltonFriedman.setName("Milton");
        miltonFriedman.setLastName("Friedman");
        listOfAuthors.add(miltonFriedman);

        Author danielKahneman = new Author();
        danielKahneman.setIdAuthor(36);
        danielKahneman.setName("Daniel");
        danielKahneman.setLastName("Kahneman");
        listOfAuthors.add(danielKahneman);

        Author johnPerkins = new Author();
        johnPerkins .setIdAuthor(37);
        johnPerkins.setName("John");
        johnPerkins.setLastName("Perkins");
        listOfAuthors.add(johnPerkins);

        //SECTIONS
        //history
        Section history = new Section();
        history.setIdSection(1);
        history.setName("History");
        listOfSections.add(history);

        //art
        Section art = new Section();
        art.setIdSection(2);
        art.setName("Arts");
        listOfSections.add(art);

        //english
        Section english = new Section();
        english.setIdSection(3);
        english.setName("English");
        listOfSections.add(english);

        //physics
        Section physics = new Section();
        physics.setIdSection(4);
        physics.setName("Physics");
        listOfSections.add(physics);

        //economics
        Section economics = new Section();
        economics.setIdSection(5);
        economics.setName("Economics");
        listOfSections.add(economics);

        //BOOKS
        //english
        Book philosophers = new Book();
        philosophers.setIdBook(1);
        philosophers.setTitle("Harry Potter and the Philosopher's Stone");
        philosophers.setAuthor(rowling);
        philosophers.setSection(english);
        listOfBooks.add(philosophers);

        Book chamber = new Book();
        chamber.setIdBook(2);
        chamber.setTitle("Harry Potter and the Chamber of Secrets");
        chamber.setAuthor(rowling);
        chamber.setSection(english);
        listOfBooks.add(chamber);

        Book azkaban = new Book();
        azkaban.setIdBook(3);
        azkaban.setTitle("Harry Potter and the Prisoner from Azkaban");
        azkaban.setAuthor(rowling);
        azkaban.setSection(english);
        listOfBooks.add(azkaban);

        Book fire = new Book();
        fire.setIdBook(4);
        fire.setTitle("Harry Potter and the Goblet of Fire");
        fire.setAuthor(rowling);
        fire.setSection(english);
        listOfBooks.add(fire);

        Book phoenix = new Book();
        phoenix.setIdBook(5);
        phoenix.setTitle("Harry Potter and the Order of the Phoenix");
        phoenix.setAuthor(rowling);
        phoenix.setSection(english);
        listOfBooks.add(phoenix);

        Book prince = new Book();
        prince.setIdBook(6);
        prince.setTitle("Harry Potter and the Half-Blood Prince");
        prince.setAuthor(rowling);
        prince.setSection(english);
        listOfBooks.add(prince);

        //physics
        Book whatIf = new Book();
        whatIf.setIdBook(7);
        whatIf.setTitle("What if");
        whatIf.setAuthor(randallMunroe);
        whatIf.setSection(physics);
        listOfBooks.add(whatIf);

        Book historyOfTime = new Book();
        historyOfTime.setIdBook(8);
        historyOfTime.setTitle("A brief history of time");
        historyOfTime.setAuthor(stephenHawking);
        historyOfTime.setSection(physics);
        listOfBooks.add(historyOfTime);

        Book hallows = new Book();
        hallows.setIdBook(9);
        hallows.setTitle("An Astronauts Guide to Life on Earth");
        hallows.setAuthor(randallMunroe);
        hallows.setSection(physics);
        listOfBooks.add(hallows);

        Book apollo = new Book();
        apollo.setIdBook(10);
        apollo.setTitle("Thirteen: The Apollo Flight That Failed");
        apollo.setAuthor(henryCooper);
        apollo.setSection(physics);
        listOfBooks.add(apollo);

        Book futureOfMind = new Book();
        futureOfMind.setIdBook(11);
        futureOfMind.setTitle("The future of the Mind");
        futureOfMind.setAuthor(michioKaku);
        futureOfMind.setSection(physics);
        listOfBooks.add(futureOfMind);

        Book lieWithStatistics = new Book();
        lieWithStatistics.setIdBook(12);
        lieWithStatistics.setTitle("How to lie with statistics");
        lieWithStatistics.setAuthor(darrellHuff);
        lieWithStatistics.setSection(physics);
        listOfBooks.add(lieWithStatistics);

        Book einsteinLifeUniverse = new Book();
        einsteinLifeUniverse.setIdBook(13);
        einsteinLifeUniverse.setTitle("Einstein: His life and universe");
        einsteinLifeUniverse.setAuthor(albertEinstein);
        einsteinLifeUniverse.setSection(physics);
        listOfBooks.add(einsteinLifeUniverse);

        Book scienceOfInterstellar = new Book();
        scienceOfInterstellar.setIdBook(14);
        scienceOfInterstellar.setTitle("The science of insterstellar");
        scienceOfInterstellar.setAuthor(kipThorne);
        scienceOfInterstellar.setSection(physics);
        listOfBooks.add(scienceOfInterstellar);

        Book satSubjectTest = new Book();
        satSubjectTest.setIdBook(15);
        satSubjectTest.setTitle("Barron’s SAT Subject Test: Physics");
        satSubjectTest.setAuthor(gregYoung);
        satSubjectTest.setSection(physics);
        listOfBooks.add(satSubjectTest);

        Book shinning = new Book();
        shinning.setIdBook(16);
        shinning.setTitle("The shinning");
        shinning.setAuthor(stephenKing);
        shinning.setSection(physics);
        listOfBooks.add(shinning);

        Book blackHouse = new Book();
        blackHouse.setIdBook(17);
        blackHouse.setTitle("Black house");
        blackHouse.setAuthor(stephenKing);
        blackHouse.setSection(physics);
        listOfBooks.add(blackHouse);

        //arts
        Book guerillaMarketing = new Book();
        guerillaMarketing.setIdBook(18);
        guerillaMarketing.setTitle("Guerrilla Marketing for Artists");
        guerillaMarketing.setAuthor(barneyDavey);
        guerillaMarketing.setSection(art);
        listOfBooks.add(guerillaMarketing);

        Book artistsWay = new Book();
        artistsWay.setIdBook(19);
        artistsWay.setTitle("The Artists Way");
        artistsWay.setAuthor(juliaCameron);
        artistsWay.setSection(art);
        listOfBooks.add(artistsWay);

        Book idRatherBe = new Book();
        idRatherBe.setIdBook(20);
        idRatherBe.setTitle("I’d Rather Be in the Studio");
        idRatherBe.setAuthor(alysonStanfield);
        idRatherBe.setSection(art);
        listOfBooks.add(idRatherBe);

        Book artistGraphicDesigner = new Book();
        artistGraphicDesigner.setIdBook(21);
        artistGraphicDesigner.setTitle("2015 Artist’s & Graphic Designer’s Market");
        artistGraphicDesigner.setAuthor(maryBostic);
        artistGraphicDesigner.setSection(art);
        listOfBooks.add(artistGraphicDesigner);
        Book starvingToSuccessful = new Book();

        starvingToSuccessful.setIdBook(22);
        starvingToSuccessful.setTitle("Starving” to Successful");
        starvingToSuccessful.setAuthor(jasonHorejs);
        starvingToSuccessful.setSection(art);
        listOfBooks.add(starvingToSuccessful);

        Book surviveProsper = new Book();
        surviveProsper.setIdBook(23);
        surviveProsper.setTitle("How to Survive and Prosper as an Artist");
        surviveProsper.setAuthor(carollMichael);
        surviveProsper.setSection(art);
        listOfBooks.add(surviveProsper);

        Book sellArt = new Book();
        sellArt.setIdBook(24);
        sellArt.setTitle("How to Sell Art to Interior Designers");
        sellArt.setAuthor(barneyDavey);
        sellArt.setSection(art);
        listOfBooks.add(sellArt);

        Book makeMoney = new Book();
        makeMoney.setIdBook(25);
        makeMoney.setTitle("How to Make Money at Craft Shows");
        makeMoney.setAuthor(malloryWhitfield);
        makeMoney.setSection(art);
        listOfBooks.add(makeMoney);

        Book artLicensing = new Book();
        artLicensing.setIdBook(26);
        artLicensing.setTitle("How to Get Started in Art Licensing");
        artLicensing.setAuthor(taraReed);
        artLicensing.setSection(art);
        listOfBooks.add(artLicensing);

        //history
        Book originOfSpecies = new Book();
        originOfSpecies.setIdBook(27);
        originOfSpecies.setTitle("The origin of species");
        originOfSpecies.setAuthor(charlesDarvin);
        originOfSpecies.setSection(history);
        listOfBooks.add(originOfSpecies);


        Book holyBible = new Book();
        holyBible.setIdBook(28);
        holyBible.setTitle("Holy Bible");
        holyBible.setAuthor(kingJames);
        holyBible.setSection(history);
        listOfBooks.add(holyBible);

        Book quran = new Book();
        quran.setIdBook(29);
        quran.setTitle("Quran");
        quran.setAuthor(islam);
        quran.setSection(history);
        listOfBooks.add(quran);

        Book communistManifesto = new Book();
        communistManifesto.setIdBook(30);
        communistManifesto.setTitle("The Communist Manifesto");
        communistManifesto.setAuthor(karlMarx);
        communistManifesto.setSection(history);
        listOfBooks.add(communistManifesto);

        Book republic = new Book();
        republic.setIdBook(31);
        republic.setTitle("The Republic");
        republic.setAuthor(plato);
        republic.setSection(history);
        listOfBooks.add(republic);

        Book godisnja1984 = new Book();
        godisnja1984.setIdBook(32);
        godisnja1984.setTitle("1984");
        godisnja1984.setAuthor(georgeOrwell);
        godisnja1984.setSection(history);
        listOfBooks.add(godisnja1984);

        Book theCompleteWorks = new Book();
        theCompleteWorks.setIdBook(33);
        theCompleteWorks.setTitle("The Complete Works");
        theCompleteWorks.setAuthor(williamShakespeare);
        theCompleteWorks.setSection(history);
        listOfBooks.add(theCompleteWorks);

        Book thePrince = new Book();
        thePrince.setIdBook(34);
        thePrince.setTitle("The prince");
        thePrince.setAuthor(niccoloMacchiavelli);
        thePrince.setSection(history);
        listOfBooks.add(thePrince);

        Book odyssey = new Book();
        odyssey.setIdBook(35);
        odyssey.setTitle("The odyssey");
        odyssey.setAuthor(homer);
        odyssey.setSection(history);
        listOfBooks.add(odyssey);

        //economics
        Book misbehaving = new Book();
        misbehaving.setIdBook(36);
        misbehaving.setTitle("1.Misbehaving: The Making of Behavioral");
        misbehaving.setAuthor(richardThaler);
        misbehaving.setSection(economics);
        listOfBooks.add(misbehaving);


        Book capitalInTwentyFirstCentury = new Book();
        capitalInTwentyFirstCentury.setIdBook(37);
        capitalInTwentyFirstCentury.setTitle("Capital in the Twenty-First Century");
        capitalInTwentyFirstCentury.setAuthor(thomasPikketty);
        capitalInTwentyFirstCentury.setSection(economics);
        listOfBooks.add(capitalInTwentyFirstCentury);

        Book theIntelligentInvestor = new Book();
        theIntelligentInvestor.setIdBook(38);
        theIntelligentInvestor.setTitle("The intelligent investor");
        theIntelligentInvestor.setAuthor(benjaminGraham);
        theIntelligentInvestor.setSection(economics);
        listOfBooks.add(theIntelligentInvestor);

        Book zeroToOne = new Book();
        zeroToOne.setIdBook(39);
        zeroToOne.setTitle("Zero to one");
        zeroToOne.setAuthor(peterThiel);
        zeroToOne.setSection(economics);
        listOfBooks.add(zeroToOne);

        Book roadToSefdom = new Book();
        roadToSefdom.setIdBook(40);
        roadToSefdom.setTitle("The road to Sefdom");
        roadToSefdom.setAuthor(friedrichHayek);
        roadToSefdom.setSection(economics);
        listOfBooks.add(roadToSefdom);

        Book theUndercoverEconomist = new Book();
        theUndercoverEconomist.setIdBook(41);
        theUndercoverEconomist.setTitle("The undercover economist");
        theUndercoverEconomist.setAuthor(timHardfor);
        theUndercoverEconomist.setSection(economics);
        listOfBooks.add(theUndercoverEconomist);

        Book capitalismAndFreedom = new Book();
        capitalismAndFreedom.setIdBook(42);
        capitalismAndFreedom.setTitle("Capitalism and Freedom");
        capitalismAndFreedom.setAuthor(miltonFriedman);
        capitalismAndFreedom.setSection(economics);
        listOfBooks.add(capitalismAndFreedom);

        Book thinkingFastAndSlow = new Book();
        thinkingFastAndSlow.setIdBook(43);
        thinkingFastAndSlow.setTitle("Thinking, Fast and Slow");
        thinkingFastAndSlow.setAuthor(danielKahneman);
        thinkingFastAndSlow.setSection(economics);
        listOfBooks.add(thinkingFastAndSlow);

        Book theCommunistManifesto = new Book();
        theCommunistManifesto.setIdBook(44);
        theCommunistManifesto.setTitle("The communist manifesto");
        theCommunistManifesto.setAuthor(karlMarx);
        theCommunistManifesto.setSection(economics);
        listOfBooks.add(theCommunistManifesto);

        Book confessionsOfAnEconomicHitman = new Book();
        confessionsOfAnEconomicHitman.setIdBook(45);
        confessionsOfAnEconomicHitman.setTitle("Confessions of an economic hit man");
        confessionsOfAnEconomicHitman.setAuthor(johnPerkins);
        confessionsOfAnEconomicHitman.setSection(economics);
        listOfBooks.add(confessionsOfAnEconomicHitman);

        //LOCATIONS

    }

}
