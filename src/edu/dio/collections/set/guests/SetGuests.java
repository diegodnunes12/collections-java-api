package edu.dio.collections.set.guests;

import java.util.HashSet;
import java.util.Set;

public class SetGuests {
    private Set<Guest> guests;

    public SetGuests() {
        this.guests = new HashSet<Guest>();
    }
    
    public void addGuest(String name, int codeInvitation) {
        guests.add(new Guest(name, codeInvitation));
    }

    public void removeGuestByCodeInvitation(int codeInvitation) {
        Guest guestRemove = null;

        for (Guest guest : guests) {
            if(guest.getCodeInvitation() == codeInvitation) {
                guestRemove = guest;
                break;
            }
        }

        guests.remove(guestRemove);
    }

    public int countGuests() {
        return guests.size();
    }

    public void showGuests() {
        System.out.println(guests);
    }

    public static void main(String[] args) {
        SetGuests guest = new SetGuests();

        guest.addGuest("Convidado 1", 1111);
        guest.addGuest("Convidado 2", 2222);
        guest.addGuest("Convidado 3", 3333);
        guest.addGuest("Convidado 4", 2222);

        System.out.println(guest.countGuests());
    }
}
