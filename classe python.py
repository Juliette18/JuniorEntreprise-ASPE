
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
import os
from kivy.uix.label import Label                    
from kivy.core.window import Window
from kivy.uix.widget import Widget                    
from plyer import notification, tts
Config.set('graphics','resizable',0)                    
from kivy.lang import Builder                    
from pdfminer.pdfinterp import PDFResourceManager, PDFPageInterpreter                    
from pdfminer.converter import TextConverter                   
from pdfminer.layout import LAParams                    
from pdfminer.pdfpage import PDFPage                   
from cStringIO import StringIO                    
rom kivy.uix.popup import Popupfrom kivy.config import Config                    
import csv

from abc import ABC, abstractmethod
class Utilisateur(ABC):
    unom =" "
    uprenom = " "
    ulogin = " "
    mdp = " "
    @abstractmethod
    def__ini__(self,nom, prenom, login,mdp ):
unom = nom
uprenom = prenom
      ulogin = login
      mdp = mdp
        pass

@abstractmethod
def connexion(Input)
String typeU;
f1 = (open("prev_details.csv"))
f2 = (open("bdd.csv"))

csv_f1 = csv.reader(f1)
csv_f2 = csv.reader(f2)
for col1, col2 in zip(csv_f1, csv_f2):
    if col1[0] not in col2[0]:
popup = Popup(title='Attention',content=Label(text='Identifiant non reconnu'),size_hint=(None, None), size=(400, 400)
popup.open()

for col in csv_f1:
csv_f1_tuples.append(tuple(row[0,2]))
for col in csv_f2:
csv_f2_tuples.append(tuple(row[0,2]))
if tuple(col[0:2])not in csv_f2_tuples:
popup = Popup(title='Attention',content=Label(text='Mot de passe non reconnu''),
size_hint=(None, None), size=(400, 400)
popup.open()
else
typeU = col2[3]




@abstractmethod
def consultConv()
convention = open( " C:/",convention.pdf)
convert_pdf_to_txt(convention," C:/")

@abstractmethod
def rechercheConv ( rechercheInput, )

@abstractmethod
def open(self, path, filename):
with open(os.path.join(path, filename[0])) as f:
print f.read()

@abstractmethod
 def convert_pdf_to_txt(self,path):
rsrcmgr = PDFResourceManager()                    
retstr = StringIO()
codec = 'utf-8'
laparams = LAParams()
device = TextConverter(rsrcmgr, retstr, codec=codec, laparams=laparams)
fp = file(path, 'rb')
 interpreter = PDFPageInterpreter(rsrcmgr, device)
password = ""
caching = True                          
maxpages = 0 
pagenos=set()   
for page in PDFPage.get_pages(fp, pagenos,maxpages=maxpages,password=password,caching=caching, check_extractable=True):
interpreter.process_page(page)
text = retstr.getvalue()
device.close()                            
fp.close()             
retstr.close()          
return text


class Personnel(Utilisateur):
    
def static_vars(**kwargs):
    def decorate(func):
        for k in kwargs:
            setattr(func, k, kwargs[k])
        return func
    return decorate
@static_vars(counter=0)
numP =0
def __init__(self):
numP = counter
super().__init__()


def consultFacture()
def modifBrouillonFacture()
def modifBrouillonConvention ()
def ajoutConvention ()
def ajoutClient()
def ajoutEtudiant()


class Etudiant(Utilisateur):
    
def static_vars(**kwargs):
    def decorate(func):
        for k in kwargs:
            setattr(func, k, kwargs[k])
        return func
    return decorate
@static_vars(counter=0)
numE =0
def __init__(self):
numE = counter
super().__init__()

    