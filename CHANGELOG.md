# [0.6.0](https://github.com/jahrim/PPS-22-chess/compare/0.5.0...0.6.0) (2023-03-14)


### Bug Fixes

* center game configuration page ([3da1e35](https://github.com/jahrim/PPS-22-chess/commit/3da1e35930c41a143c141a044eb9259e1722e227))
* center main menu page ([e64767d](https://github.com/jahrim/PPS-22-chess/commit/e64767d5ad620ca9092da53013850c0a25520025))
* change Promote API + fix turn changed ([67a30aa](https://github.com/jahrim/PPS-22-chess/commit/67a30aae9c747c199f51ef6570156f4f286b97a9))
* change VerticleExecutor to remove the task from the pending tasks when its execution is completed ([531baf7](https://github.com/jahrim/PPS-22-chess/commit/531baf741a53373e5418f46d04101d0071ba037e))
* **deps:** update dependency io.vertx:vertx-core to v4.4.0 ([3990e51](https://github.com/jahrim/PPS-22-chess/commit/3990e51df1d6c58d75c696a1d68eeeb8de80722e))
* **deps:** update dependency org.wartremover:wartremover_3.2.2 to v3.0.11 ([bfb635b](https://github.com/jahrim/PPS-22-chess/commit/bfb635b65520fee5a1d73ea07bf46bfcb95ae366))
* initialize all the Prolog Rules when starting the game ([f0d876e](https://github.com/jahrim/PPS-22-chess/commit/f0d876e4656a875f20b53ecbe5509fefe5246840))
* remove unused parameter + not needed brackets ([6bdda25](https://github.com/jahrim/PPS-22-chess/commit/6bdda25a4b887029c41a71a16e9c7b01e6e13747))
* run promotion painting on correct thread ([2c8ef22](https://github.com/jahrim/PPS-22-chess/commit/2c8ef224573df6146134726712d310f4959e9904))


### Features

* create check notification ([2f718be](https://github.com/jahrim/PPS-22-chess/commit/2f718be26d726c94777608ba8d6745ff9b13e624))

# [0.5.0](https://github.com/jahrim/PPS-22-chess/compare/0.4.0...0.5.0) (2023-03-07)


### Bug Fixes

* add pawn checks that don't let it move outside the board ([8762939](https://github.com/jahrim/PPS-22-chess/commit/876293956a356e78d49a1ca6637eed6385bf07e4))
* add the cause to the game termination window ([f281b0f](https://github.com/jahrim/PPS-22-chess/commit/f281b0ffb7414887180bba00386163966940d851))
* avoid computing double step on some ranks ([137b380](https://github.com/jahrim/PPS-22-chess/commit/137b38062ad6b44d94c15443999dd2ba119b8c7d))
* avoid going outside the board limits in Pawn Capture Spec ([271a226](https://github.com/jahrim/PPS-22-chess/commit/271a226de1ec779d4ac31fa554d9e519017cbf76))
* change game to run on an event loop and to have a state ([bf7d57b](https://github.com/jahrim/PPS-22-chess/commit/bf7d57b8111625ab806a21de6289087df3539671))
* improve first move check of the pawn ([fe9fd67](https://github.com/jahrim/PPS-22-chess/commit/fe9fd67f8528a6eee48f84cd1e471a579d67be57))
* remove unused javafx + scalafmt dependencies from jar ([ee00a0b](https://github.com/jahrim/PPS-22-chess/commit/ee00a0bf6ba259ac7a766984be4530a42e4de4ba))
* set promotion dialog not closeable in any way ([11f9f46](https://github.com/jahrim/PPS-22-chess/commit/11f9f46d32792f984a32dd330f0fa4609b9cd5d4))
* set stage not resizable as default ([3871c36](https://github.com/jahrim/PPS-22-chess/commit/3871c364982e0325a8616785605a674b7750e9a9))
* solve adversary pieces being selectable on some occasions ([d15b923](https://github.com/jahrim/PPS-22-chess/commit/d15b92324112a11a15fe4e091807db9215fd33c7))
* solve rebase issues ([a86aa12](https://github.com/jahrim/PPS-22-chess/commit/a86aa126a199f876d06b413979f0b48c77fec00b))
* unsubscribe to events at the end of the game ([61278d4](https://github.com/jahrim/PPS-22-chess/commit/61278d4635262884a2857f0e4781767219761dad))


### Features

* add timer constraint per player ([341cc21](https://github.com/jahrim/PPS-22-chess/commit/341cc21276c5fa3ca56ad7037fd336206e2c5796))


### Performance Improvements

* remove useless timer stopping ([7ba49c6](https://github.com/jahrim/PPS-22-chess/commit/7ba49c69eab753c7b0641c9d5be6a65655239492))

# [0.4.0](https://github.com/jahrim/PPS-22-chess/compare/0.3.0...0.4.0) (2023-02-27)


### Bug Fixes

* add capturing piece highlight ([833a09c](https://github.com/jahrim/PPS-22-chess/commit/833a09c985de6b19385f28162f875951f7af657b))
* add piece deselection ([dcfa0b8](https://github.com/jahrim/PPS-22-chess/commit/dcfa0b81e6272a458ad1d2cf002191e2ade2b063))
* avoid moving a piece to a position that would cause a check to the current player and clean up code ([ce24a16](https://github.com/jahrim/PPS-22-chess/commit/ce24a162e3bd167c5396c71a3b0a31ffbc6ae853))
* change pawn capture rule to provide CaptureMoves instead of normal Moves ([3288634](https://github.com/jahrim/PPS-22-chess/commit/3288634bef35b87461571baabb8dd188844bfeaa))
* **deps:** update dependency org.scala-lang:scala3-library_3 to v3.2.2 ([8f9ed69](https://github.com/jahrim/PPS-22-chess/commit/8f9ed694c285b9e1320dc4ca481c2a017ba90965))
* edit Diagonal and Straight Rules to work with the generic capture analysis ([68bcaef](https://github.com/jahrim/PPS-22-chess/commit/68bcaefe1432b1ac5b60116641a9bb87850d5bda))
* fix capture move to create a CaptureMove instead of a Move ([041b506](https://github.com/jahrim/PPS-22-chess/commit/041b50607e205bf116918db8f56ad96c0c68823b))
* fix piece deselection + piece selection only if it's current team turn ([ec4b6c3](https://github.com/jahrim/PPS-22-chess/commit/ec4b6c3dd2eabf1c037269bf03e1caf9fb99cc80))
* Improve rule creation to avoid duplicating prolog engines ([197818e](https://github.com/jahrim/PPS-22-chess/commit/197818ee373972da845de30858d5b34791765180))
* make model components immutable ([9cb5a86](https://github.com/jahrim/PPS-22-chess/commit/9cb5a8632cddeb3fce4eb2febafbdc6e11ff28bb))
* solve pawns not being able to capture on File H ([6a0f937](https://github.com/jahrim/PPS-22-chess/commit/6a0f937c5d6be830c9b577defceef6500ccc4fbd))
* switch turn after a move ([04fffb8](https://github.com/jahrim/PPS-22-chess/commit/04fffb8d950d87a24a81f9969f2ff14ae0a24c47))


### Features

* add avoid self check mixin ([956b707](https://github.com/jahrim/PPS-22-chess/commit/956b70782a74364e6288aba19fabc85675d28255))
* add capture analyzis to the King and the Knight ([1373aa4](https://github.com/jahrim/PPS-22-chess/commit/1373aa43071eb76ecb7763746088fab8cab13b53))
* add chess board situation interface ([9eb1475](https://github.com/jahrim/PPS-22-chess/commit/9eb147523ada0667456ac57d8551ffb48f243858))
* add en passant rule and fix move history not being filled ([602e196](https://github.com/jahrim/PPS-22-chess/commit/602e196673ccc7ed87269ec0f381dc869d94498f))
* add events that update the view after each move ([a4de5b4](https://github.com/jahrim/PPS-22-chess/commit/a4de5b45fc723729b2618206311771096632f0a7))
* add funtionality that alternate turn between players ([3b0ca03](https://github.com/jahrim/PPS-22-chess/commit/3b0ca03df5e2d58ab2ed975bb7d0db3557962e9d))
* add game over conditions (checkmate, stale, surrender, timeout) ([0437318](https://github.com/jahrim/PPS-22-chess/commit/043731884950c269ad7b467e5cbe00e2e4388a6d))
* add generic rules to analyze captures for any piece ([96972d5](https://github.com/jahrim/PPS-22-chess/commit/96972d597984b577a38ffe8d591a72391cabdc35))
* add progress indicator when starting the game ([9279cde](https://github.com/jahrim/PPS-22-chess/commit/9279cded8ca84caf4cf8817b4f525a229e625601))
* add promotion feature ([8ba95d3](https://github.com/jahrim/PPS-22-chess/commit/8ba95d393368bed90a44891e8ded9449d3aea377))
* add the visualization of the initial state of a game ([bfb5b6d](https://github.com/jahrim/PPS-22-chess/commit/bfb5b6d6f97c91a21ea104b32edadbefe03b40da))
* add timer mode per move ([b679648](https://github.com/jahrim/PPS-22-chess/commit/b679648017fb2a78ccf0a0d4df9d12e85fe0370a))
* create game configuration + update related view ([8b8e67c](https://github.com/jahrim/PPS-22-chess/commit/8b8e67cad321f3a28bf7d48086aa04fb87feba45))
* remove chess board situation interface and add chess game analyzer ([a16c9fb](https://github.com/jahrim/PPS-22-chess/commit/a16c9fb07aeaf7d67575614c181b3d475aee6194))

# [0.3.0](https://github.com/jahrim/PPS-22-chess/compare/0.2.0...0.3.0) (2023-02-20)


### Bug Fixes

* remove pawn moves dependency on the turn and remove capture moves with no adversaries ([28bea0d](https://github.com/jahrim/PPS-22-chess/commit/28bea0d02773485372c063c7290626af270b222a))


### Features

* add basic implementation of the chess game state and the move history ([af695ec](https://github.com/jahrim/PPS-22-chess/commit/af695ec0f8e0f81b026353d839510948aa2e5c09))
* add interfaces for the chess game state and the move history ([783be06](https://github.com/jahrim/PPS-22-chess/commit/783be0636279d63fce25b7ca9448b9779dadd9a1))
* add Pawn rule and textual fix to Pawn specifications ([be93e3f](https://github.com/jahrim/PPS-22-chess/commit/be93e3fd23e932f8c0f0ec4f6654777bfd9b4d53))
* add Pawn rule that lets it move one step forward. ([4142951](https://github.com/jahrim/PPS-22-chess/commit/4142951b8b8d6793ae592b2c7b8aedbb85373844))
* add Pawn rule that lets it move two steps forward ([50ee6c3](https://github.com/jahrim/PPS-22-chess/commit/50ee6c3f4a0951ff62bb9986086a009e88ecb46f))
* add prolog rules for the NE and NW diagonal moves. ([db6013f](https://github.com/jahrim/PPS-22-chess/commit/db6013f50eca223402956223747c44d5b4e86ebd))
* add rook and queen chess rules ([ec60220](https://github.com/jahrim/PPS-22-chess/commit/ec60220f7b1000ef33187cae021c196a9f8ef95f))
* add the finding of all moving positions of a Pawn ([330e591](https://github.com/jahrim/PPS-22-chess/commit/330e5912f2af6c13fab30911056b8e12ed330db5))
* add the finding of the capture moves to the pawn rules ([3df15fa](https://github.com/jahrim/PPS-22-chess/commit/3df15fa1a8cac4b198c6ca5a81d80a88f118679d))
* create castling move + refactoring ([07027b9](https://github.com/jahrim/PPS-22-chess/commit/07027b9597f6daa762f78c9b90284be33c06778e))
* create diagonal rules + create bishop ([44a78ce](https://github.com/jahrim/PPS-22-chess/commit/44a78ce3299bdfbef360b572d679c403a2055371))
* create king movement rule + castling rule ([49fa73f](https://github.com/jahrim/PPS-22-chess/commit/49fa73f34ef20c14b92e1ad185da4b479f72a86b))
* create knight with its L rule ([660030a](https://github.com/jahrim/PPS-22-chess/commit/660030a9469995e7a84503b41d24625bd36379b6))
* create prolog engine + model rules ([19d2e4a](https://github.com/jahrim/PPS-22-chess/commit/19d2e4aabee6c43227f5a8fb7d4c838d662daeb9))
* **integration:** change chess engine service api and integrate the chess application with the chess engine service ([9b3ea0b](https://github.com/jahrim/PPS-22-chess/commit/9b3ea0b1a61a7b24e8bc5deda45a9df57d1a2d77))
* reduce diagonal moves checking the current status ([48ff767](https://github.com/jahrim/PPS-22-chess/commit/48ff76777ec0577b2481d43a9851b729f48c1a0c))

# [0.2.0](https://github.com/jahrim/PPS-22-chess/compare/0.1.0...0.2.0) (2023-02-13)


### Bug Fixes

* **dependency:** add ScalaFX and JavaFX dependencies ([2321757](https://github.com/jahrim/PPS-22-chess/commit/23217574511bdc8fd543207dfcfd003a0bf8c008))
* **model:** change pawn movement and team turn temporarily ([a2afe54](https://github.com/jahrim/PPS-22-chess/commit/a2afe54eb57be5300c60ae603bedd37bb3ee9a65))
* solve the issue related to the change of the turn after making a not acceptable move and add tests for the chess board. ([54e7c82](https://github.com/jahrim/PPS-22-chess/commit/54e7c8219fefd0b26f4e53014c2d1f2253d89c10))


### Features

* add chess board factory and Position to Move mapping. ([5eccff4](https://github.com/jahrim/PPS-22-chess/commit/5eccff49a8e6282d7e852a394be51f15533ba714))
* add missing chess board functionalities and the relative tests. ([6b8b303](https://github.com/jahrim/PPS-22-chess/commit/6b8b30371b2450485316eaad26371cc7f8272455))
* add Team concept and implement ChessBoard. ([f1f453e](https://github.com/jahrim/PPS-22-chess/commit/f1f453ee4b0f821b37cc7848046e08d71417ace0))
* define chess board base models ([79959aa](https://github.com/jahrim/PPS-22-chess/commit/79959aa63bcba8733ce77f8b095f47bbcf575560))
* **gui:** add component organization into pages and page-controllers. ([7eb5230](https://github.com/jahrim/PPS-22-chess/commit/7eb52307f197c9f21bfcc5e60505a4fc266866ba))
* **gui:** add game page and game page controller ([80ff368](https://github.com/jahrim/PPS-22-chess/commit/80ff3683be38078f055a19e308a163898c920e14))
* implement base hexagonal architecture components ([bb8a98a](https://github.com/jahrim/PPS-22-chess/commit/bb8a98a11e5f5ba1513f80fb59ae0449ca37237b))
* implement branch-related traits + test ([19b5200](https://github.com/jahrim/PPS-22-chess/commit/19b5200eae77e758d9b7e71d86d1baa83465f00b))
