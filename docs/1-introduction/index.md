# Introduzione
In questo progetto si vuole realizzare un sistema che permetta a due utenti di giocare a scacchi sullo stesso 
dispositivo.

Gli scacchi sono un gioco di strategia in cui è prevista una _scacchiera_ di gioco divisa per colonna (_file_) e per
riga (_rank_).

Sulla scacchiera sono presenti dei _pezzi_, ovvero delle pedine, di due colori diversi (_bianco_ e _nero_) 
corrispondenti alle due squadre nel gioco. Esistono diversi tipi di pezzi:
- _Pedone_ (pawn)
- _Cavallo_ (knight)
- _Alfiere_ (bishop)
- _Torre_ (rook)
- _Re_ (king)
- _Regina_ (queen)

Ogni pezzo è caratterizzato da un insieme di _mosse_ che può eseguire: 
- si può _muovere_ sulla scacchiera in base a delle specifiche regole di movimento
- può _catturare_ i pezzi della squadra avversaria in base a delle specifiche regole di cattura. Durante la _cattura_ di 
  un pezzo, il pezzo viene rimosso dalla scacchiera e rimpiazzato dal pezzo attaccante.

Quando un pezzo può catturare il re avversario nel turno successivo, la situazione prende il nome di _scacco_. Nel caso
in cui il giocatore non può effettuare una mossa per uscire dalla situazione di scacco, allora si parla di _scacco 
matto_. Quando invece un giocatore non si trova nella situazione di scacco ma non può muovere nessun pezzo, allora si
parla di _stallo_.

Il gioco si svolge a _turni_ alternati tra i giocatori. Durante un turno, un giocatore può effettuare una mossa con uno
dei suoi pezzi. Lo scopo del gioco è quello di dare lo scacco matto al proprio avversario.

[Back to index](../index.md) | 
[Next Chapter](../2-development-process/index.md)