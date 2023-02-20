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
