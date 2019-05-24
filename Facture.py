# -*- coding: utf-8 -*-
"""
Created on Fri May 17 04:52:21 2019

@author: carole
"""

from datetime import date
from abc import ABC, abstractmethod
from reportlab.pdfgen import canvas
from reportlab.lib.units import inch
import Document
import Convention.py


class Facture(Document):
    
    numeroFacture = 0
    statut = "En attente"
    montant = 0
    numeroConvention
    
    def __init__(self, numeroConvention):
        super().__init__(self)
        numeroFacture = numeroFacture + 1
        self.numeroConvention = numeroConvention
    
    def setMontant(self, montant): 
        self.montant = montant
        
    
    #methode PDF facture
    def créerPDFFacture(self):
         #on définit les variables contenant les infos     
        nom_client = str("Client: "+ self.nomClient)
        nom_etudiant = str("Etudiant: "+ self.nomEtudiant)
        montant = str("Montant: " + self.montant)
        numero_facture = str("Numero de Facture: "+ self.numeroFacture)
        numero_convention = str("Numero de Convention: "+ self.numeroConvention)
        temp_date = str(date.today().strtime("%d/%m/%Y"))
        
        #variable contenant le nom du fichier: C pour convention
        nomfichier = "F_"+self.numeroFacture
        
        #open opens a file and writes in it
        #"a" for append and the + sign means if it is not there then create it
        f = open(nomfichier, "a+")
        
        #we write in the file
        f.write(numero_facture+"Correspondant au ")
        f.write(numero_convention+"\n")
        f.write(nom_client+"\n")
        f.write(nom_etudiant+"\n")
        f.write(montant+"\n")
        f.write("\n Fais le : "+temp_date)
        
        #read reads the file and stores it in a variable
        text = f.read
        
        #close the file
        f.close
        
        #os.system("pause")
        font = "Helvetica"
        font_size = 26    
        x = 5.0 * inch
        y = 8.0 * inch
        destination_file = ".\\"+nomfichier+".pdf"
        my_canvas = canvas.Canvas(destination_file)
        my_canvas.setFont(font, font_size)
        my_canvas.drawRightString(x, y, text)
        my_canvas.save()
        changerStatutFacture()
        
        os.startfile(nomfichier+".pdf")
    
    def changerStatutFacture(self):
        #status changes when user checks Payee in the payment tab in the menu
        if self.statut=="En attente":
            self.statut="Payée"
    
    def getStatut(self):
        return self.statut
    
    def getNumeroFacture(self):
        return self.numeroFacture
    
    def getNumeroConvention(self):
        return self.numeroConvention
    
    def getMontant(self):
        return self.montant