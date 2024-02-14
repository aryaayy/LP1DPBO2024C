class Anggota:
    __id = ""
    __nama = ""
    __bidang = ""
    __partai = ""

    def __init__(self, id = "", nama = "", bidang = "", partai = ""):
        self.__id = id
        self.__nama = nama
        self.__bidang = bidang
        self.__partai = partai
    
    def getId(self):
        return self.__id
    
    def setId(self, id):
        self.__id = id
    
    def getNama(self):
        return self.__nama
    
    def setNama(self, nama):
        self.__nama = nama
    
    def getBidang(self):
        return self.__bidang
    
    def setBidang(self, bidang):
        self.__bidang = bidang
    
    def getPartai(self):
        return self.__partai
    
    def setPartai(self, partai):
        self.__partai = partai