from Anggota import Anggota

print("Command list:\n1. ADD\n2. DEL\n3. UPDATE\n4. SHOW\n")

list = []
command = ""
while command != "END":
    command = input("Please write your command: ").upper()
    
    if command != "END":
        if command == "ADD":
            # tambahkan data baru jika memilih command ADD
            id, nama, bidang, partai = input("Input data: ").split()
            temp = Anggota(id, nama, bidang, partai)
            list.append(temp)
            print("Data has been added")
        elif command == "DEL":
            # hapus data sesuai nama inputan
            search = input("Input the person's name: ")
            
            found = False
            i = 0
            # cari data di list
            while i < len(list) and found == False:
                if search == list[i].getNama():
                    print(f"{list[i].getNama()} has been deleted")
                    list.pop(i)
                    found = True
                else:
                    i += 1
            
            if found == False:
                # jika data tidak ditemukan
                print("Data not found")
        elif command == "UPDATE":
            # ubah data sesuai input
            search = input("Input the person's name: ")

            found = False
            i = 0
            # cari data yang ingin diubah
            while i < len(list) and found == False:
                if search == list[i].getNama():
                    tempId = list[i].getId()
                    tempNama = list[i].getNama()
                    tempBidang = list[i].getBidang()
                    tempPartai = list[i].getPartai()

                    id, nama, bidang, partai = input("Input new data: ").split()

                    # ubah data sesuai input
                    list[i].setId(id)
                    list[i].setNama(nama)
                    list[i].setBidang(bidang)
                    list[i].setPartai(partai)

                    print(f"Data has been changed\n{tempId} | {tempNama} | {tempBidang} | {tempPartai} --> {list[i].getId()} | {list[i].getNama()} | {list[i].getBidang()} | {list[i].getPartai()}")

                    found = True
                else:
                    i+=1
        elif command == "SHOW":
            if len(list) != 0:
                #jika list tidak kosong

                #cari karakter terpanjang di setiap kolom
                spaces = [2, 4, 6, 6]
                for item in list:
                    spaces[0] = max(len(item.getId()), spaces[0])
                    spaces[1] = max(len(item.getNama()), spaces[1])
                    spaces[2] = max(len(item.getBidang()), spaces[2])
                    spaces[3] = max(len(item.getPartai()), spaces[3])
                
                # print frame dan header tabel
                total = spaces[0] + spaces[1] + spaces[2] + spaces[3] + 7
                print("+", end="")
                for i in range(total):
                    print('-', end='')
                print("+")
                    
                print("|ID ", end="")
                for i in range (spaces[0]-2):
                    print(" ", end="")
                    
                print("|NAMA ", end="")
                for i in range (spaces[1]-4):
                    print(" ", end="")
                    
                print("|BIDANG ", end="")
                for i in range (spaces[2]-6):
                    print(" ", end="")
                    
                print("|PARTAI ", end="")
                for i in range (spaces[3]-6):
                    print(" ", end="")
                
                print("|")

                print("+", end="")
                for i in range(total):
                    print('-', end='')
                print("+")

                # print isi tabel
                for item in list:
                    print(f"|{item.getId()} ", end="")
                    for i in range(spaces[0]-len(item.getId())):
                        print(" ", end="")
                        
                    print(f"|{item.getNama()} ", end="")
                    for i in range(spaces[1]-len(item.getNama())):
                        print(" ", end="")

                    print(f"|{item.getBidang()} ", end="")
                    for i in range(spaces[2]-len(item.getBidang())):
                        print(" ", end="")

                    print(f"|{item.getPartai()} ", end="")
                    for i in range(spaces[3]-len(item.getPartai())):
                        print(" ", end="")

                    print("|")
                print("+", end="")
                for i in range(total):
                    print('-', end='')
                print("+")
            else:
                print("Empty list")
        else:
            print("COMMAND NOT RECOGNIZED")
        
        print("")