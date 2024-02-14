import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        // buat scanner
        Scanner sc = new Scanner(System.in);

        // print list command
        System.out.println("Command list:\n1. ADD\n2. DEL\n3. UPDATE\n4. SHOW\n");

        // buat list
        ArrayList<Anggota> list = new ArrayList<>();
        String command = "";
        int i;
        do{
            // input command
            System.out.print("Please write your command: ");
            command = sc.next().toUpperCase();
            String id, nama, bidang, partai;
            if(!command.equals("END")){
                if(command.equals("ADD")){
                    // tulis data baru jika memilih command ADD
                    System.out.print("Input data: ");
                    id = sc.next();
                    nama = sc.next();
                    bidang = sc.next();
                    partai = sc.next();

                    Anggota temp = new Anggota(id, nama, bidang, partai);
                    list.add(temp);
                    System.out.println("Data has been added");
                }
                else if(command.equals("DEL")){
                    // hapus data sesuai input
                    System.out.print("Input the person's name: ");
                    String search = sc.next();
                    
                    // cari data yang diinput
                    boolean found = false;
                    i = 0;
                    while(i < list.size() && !found){
                        if(search.equals(list.get(i).getNama())){
                            System.out.println(search + " has been deleted");
                            list.remove(i);
                            found = true;
                        }
                        else{
                            i++;
                        }
                    }
                    
                    if(!found){
                        // jika data tidak ditemukan
                        System.out.println("Data not found");
                    }
                }
                else if(command.equals("UPDATE")){
                    // update data sesuai input
                    System.out.print("Input the person's name: ");
                    String search = sc.next();

                    boolean found = false;
                    i = 0;
                    while(i < list.size() && !found){
                        // cari data terlebih dahulu
                        if(search.equals(list.get(i).getNama())){
                            String tempId, tempNama, tempBidang, tempPartai;
                            tempId = list.get(i).getId();
                            tempNama = list.get(i).getNama();
                            tempBidang = list.get(i).getBidang();
                            tempPartai = list.get(i).getPartai();
                            
                            System.out.print("Input new data: ");
                            id = sc.next();
                            nama = sc.next();
                            bidang = sc.next();
                            partai = sc.next();

                            // ubah data sesuai input baru
                            list.get(i).setId(id);
                            list.get(i).setNama(nama);
                            list.get(i).setBidang(bidang);
                            list.get(i).setPartai(partai);

                            System.out.println("Data has been changed\n" + tempId + " | " + tempNama + " | " + tempBidang + " | " + tempPartai + " --> " + list.get(i).getId() + " | " + list.get(i).getNama() + " | " + list.get(i).getBidang() + " | " + list.get(i).getPartai());

                            found = true;
                        }
                        else{
                            i++;
                        }
                    }
                }
                else if(command.equals("SHOW")){
                    if(!list.isEmpty()){
                        // jika list tidak kosong, maka print tabel

                        // cari jumlah karakter terpanjang untuk setiap kolom
                        int[] spaces = new int[]{2, 4, 6, 6};
                        for(Anggota item : list){
                            spaces[0] = Math.max(item.getId().length(), spaces[0]);
                            spaces[1] = Math.max(item.getNama().length(), spaces[1]);
                            spaces[2] = Math.max(item.getBidang().length(), spaces[2]);
                            spaces[3] = Math.max(item.getPartai().length(), spaces[3]);
                        }

                        // buat frame dan header
                        int total = spaces[0] + spaces[1] + spaces[2] + spaces[3] + 7;
                        System.out.print("+");
                        for(i = 0; i < total; i++){
                            System.out.print("-");
                        }
                        System.out.println("+");

                        System.out.print("|ID ");
                        for(i = 0; i < spaces[0] - 2; i++){
                            System.out.print(" ");
                        }

                        System.out.print("|NAMA ");
                        for(i = 0; i < spaces[1] - 4; i++){
                            System.out.print(" ");
                        }

                        System.out.print("|BIDANG ");
                        for(i = 0; i < spaces[2] - 6; i++){
                            System.out.print(" ");
                        }

                        System.out.print("|PARTAI ");
                        for(i = 0; i < spaces[3] - 6; i++){
                            System.out.print(" ");
                        }
                        System.out.println("|");

                        System.out.print("+");
                        for(i = 0; i < total; i++){
                            System.out.print("-");
                        }
                        System.out.println("+");
                        
                        // print isi list
                        for(Anggota item : list) {
                            System.out.print("|" + item.getId() + " ");
                            for(i = 0; i < spaces[0] - item.getId().length(); i++){
                                System.out.print(" ");
                            }

                            System.out.print("|" + item.getNama() + " ");
                            for(i = 0; i < spaces[1] - item.getNama().length(); i++){
                                System.out.print(" ");
                            }

                            System.out.print("|" + item.getBidang() + " ");
                            for(i = 0; i < spaces[2] - item.getBidang().length(); i++){
                                System.out.print(" ");
                            }

                            System.out.print("|" + item.getPartai() + " ");
                            for(i = 0; i < spaces[3] - item.getPartai().length(); i++){
                                System.out.print(" ");
                            }
                            System.out.println("|");
                        }
                        
                        System.out.print("+");
                        for(i = 0; i < total; i++){
                            System.out.print("-");
                        }
                        System.out.println("+");
                    }
                    else{
                        // jika list kosong
                        System.out.println("Empty list");
                    }
                }
                else{
                    System.out.println("COMMAND NOT RECOGNIZED");
                }
                System.out.print('\n');
            }
        }while(!command.equals("END"));

        sc.close();
    }
}