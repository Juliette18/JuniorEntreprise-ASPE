# -*- coding: utf-8 -*-
"""
Created on Fri May 17 14:29:32 2019

@author: Juliette
"""

class Entreprise: 
    
    def __init__(self,nom,adresse):
        
        self.nom= nom
        self.adresse=adresse
        self.factures=[]#ldob
        self.paiements= [] #liste/tableau d'objets
        self.debiteur= False
        self.sommeF
        self.sommeP
        
        
    def ajoutFacture(self,facture):
        self.factures.append(facture)
    
    def sommeFactures(self):     
        for f in self.factures:
            self.sommeF= self.sommeF + self.factures[f]
        
            
        return self.sommeFactures
    
    def ajoutPaiement(self,paiement):
        self.paiements.append(paiement)
        
    def sommePaiements (self):
        for p in self.paiements :
           self.sommeP= self.sommeP +self.paiements[p]
         
            
        return self.sommeP
        
    def estDebiteur (self,debiteur):
        self.debiteur=debiteur
        
            
     
#class Paiement (Entreprise):
#    
#    def __init__(self,num,montant):
#        
#        self.num = num
#        self.montant= montant
        
#    def getNum ():
#        return self.num
#    
#    def getMontant():
#        return self.montant
    

    
p= Paiement(1,150)
print(p.num)
print(p.montant)
    
    
    
    
        
    
                
            