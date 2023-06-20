package main.controllers;

import main.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class DefaultController
{
    @Autowired
    private ConcertsRepository concertsRepository;
    @Autowired
    private BuyersRepository buyersRepository;

    @RequestMapping(value = "/")
    public String index(Model model)  {return "index";}

    @GetMapping("/")
    public String ticket(@RequestParam(name = "nameBand", required = false) String nameband, Model model)
    {
        model.addAttribute("tickets", search(nameband));
        return "index";
    }

    @PostMapping(value = "/")
    public String buyTicket(String inputEmail1,String inputFullname1,Integer idForBuy, Model model){
        Buyers buyer = new Buyers();
        buyer.setEmail(inputEmail1);
        buyer.setName(inputFullname1);
        Optional<Concerts> concerts = concertsRepository.findById(idForBuy);
        buyer.setConcerts(concerts.get());
        buyersRepository.save(buyer);
        return "redirect:/";
    }

    public List<String[]> search(String nameBand) {
        System.out.println("Success");
        Iterable<Concerts> concerts = concertsRepository.findAll();
        List<String[]> list = new ArrayList<>();
        try {
            for (Concerts concert : concerts) {

                if (concert.getBand().getNameBand().contains(nameBand)) {

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
        }
        catch (Exception ex)
        {
            for (Concerts concert : concerts) {


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
