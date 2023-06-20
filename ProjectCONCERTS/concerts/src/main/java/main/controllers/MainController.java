package main.controllers;

import main.entities.Buyers;
import main.entities.BuyersRepository;
import main.entities.Concerts;
import main.entities.ConcertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MainController
{
    @Autowired
    ConcertsRepository concertsRepository;
    @Autowired
    BuyersRepository buyersRepository;
    @RequestMapping(value = "/allTicket", method = RequestMethod.GET)
    public List<String[]> allTickets()
    {
        Iterable<Concerts> concerts = concertsRepository.findAll();
        List<String[]> list = new ArrayList<>();
        for(Concerts concert : concerts)
        {
            String[] str = new String[10];

            str[0] = concert.getBand().getNameBand();
            str[1] = Integer.toString(concert.getPrice());
            str[2] = concert.getGenare().getGenare();
            str[3] = concert.getAdress().getAdress();
            str[4] = concert.getMonth().getMonth().toString();
            str[6] = concert.getBand().getImgBand();
            str[7] = Integer.toString(concert.getCountSit());
            str[8] = concert.getBand().getBandMembers();
            str[9] = Integer.toString(concert.getId());
            list.add(str);
        }



        return list;
    }
    @RequestMapping(value = "/rock", method = RequestMethod.GET)
    public List<String[]> rock() {
        Iterable<Concerts> concerts = concertsRepository.findAll();
        List<String[]> list = new ArrayList<>();
        for (Concerts concert : concerts) {
            if (concert.getGenare().getGenare().equals("Рок")) {

                String[] str = new String[10];

                str[0] = concert.getBand().getNameBand();
                str[1] = Integer.toString(concert.getPrice());
                str[2] = concert.getGenare().getGenare();
                str[3] = concert.getAdress().getAdress();
                str[4] = concert.getMonth().getMonth().toString();
                str[6] = concert.getBand().getImgBand();
                str[7] = Integer.toString(concert.getCountSit());
                str[8] = concert.getBand().getBandMembers();
                str[9] = Integer.toString(concert.getId());
                list.add(str);
            }
        }
        return list;

    }

    @RequestMapping(value = "/rap", method = RequestMethod.GET)
    public List<String[]> rap() {
        Iterable<Concerts> concerts = concertsRepository.findAll();
        List<String[]> list = new ArrayList<>();
        for (Concerts concert : concerts) {
            if (concert.getGenare().getGenare().equals("Рэп")) {

                String[] str = new String[10];

                str[0] = concert.getBand().getNameBand();
                str[1] = Integer.toString(concert.getPrice());
                str[2] = concert.getGenare().getGenare();
                str[3] = concert.getAdress().getAdress();
                str[4] = concert.getMonth().getMonth().toString();
                str[6] = concert.getBand().getImgBand();
                str[7] = Integer.toString(concert.getCountSit());
                str[8] = concert.getBand().getBandMembers();
                str[9] = Integer.toString(concert.getId());
                list.add(str);
            }
        }
        return list;
    }

    @RequestMapping(value = "/classic", method = RequestMethod.GET)
    public List<String[]> classic() {
        Iterable<Concerts> concerts = concertsRepository.findAll();
        List<String[]> list = new ArrayList<>();
        for (Concerts concert : concerts) {
            if (concert.getGenare().getGenare().equals("Классическая музыка")) {

                String[] str = new String[10];

                str[0] = concert.getBand().getNameBand();
                str[1] = Integer.toString(concert.getPrice());
                str[2] = concert.getGenare().getGenare();
                str[3] = concert.getAdress().getAdress();
                str[4] = concert.getMonth().getMonth().toString();
                str[6] = concert.getBand().getImgBand();
                str[7] = Integer.toString(concert.getCountSit());
                str[8] = concert.getBand().getBandMembers();
                str[9] = Integer.toString(concert.getId());
                list.add(str);
            }
        }
        return list;
    }
}
